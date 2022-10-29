package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Implementation of an appiance dao that reads
 * the information from file in resources folder
 */
public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String APPLIANCES_DB = "./src/main/resources/appliances_db.xml";

	/**
	 * {@inheritDoc}
	 * Assumes that file is in the correct format
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> matches = new ArrayList<>();
		try{

			// Create document builder
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

			// Create DOM tree document from a file
			Document document = documentBuilder.parse(new File(APPLIANCES_DB));

			// Get root element
			Node root = document.getDocumentElement();

			// Get all sub elements
			NodeList nodes = root.getChildNodes();

			for (int i = 0; i < nodes.getLength(); i++){
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE){
					if (node.getNodeName().equalsIgnoreCase(criteria.getGroupSearchName())){
						ApplianceCreator ac = ApplianceCreatorFactory.getInstance().getCreator(node.getNodeName());
						Appliance appliance = ac.create(node.getChildNodes());

						Map<String, Object> criterias = criteria.getSearchCriteria();
						boolean isValid = true;

						for (Map.Entry<String, Object> entry: criterias.entrySet()){
							String key = entry.getKey();
							Object value = entry.getValue();

							if (!appliance.mathches(key, value)){
								isValid = false;
								break;
							}
						}

						if (isValid){
							matches.add(appliance);
						}
					}
				}
			}
		}
		catch (Exception e){
			return null;
		}
		if (matches.size() != 0)
			return matches;
		else
			return null;

	}
	
	// you may add your own code here

}


//you may add your own new classes