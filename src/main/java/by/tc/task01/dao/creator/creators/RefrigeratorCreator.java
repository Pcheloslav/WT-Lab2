package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.naming.CompositeName;

/**
 * Represents creator of a refrigerator appliance
 */
public class RefrigeratorCreator implements ApplianceCreator {

    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String WEIGHT = "weight";
    private static final String FREEZER_CAPACITY = "freexerCapacity";
    private static final String OVERALL_CAPACITY = "overllCapacity";
    private static final String HEIGHT = "height";
    private static final String WIDTH = "width";

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(NodeList nodes) {
        Refrigerator refrigerator = new Refrigerator();

        for (int i = 0; i < nodes.getLength(); i++){
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()){
                    case POWER_CONSUMPTION -> refrigerator.power_consumption = Integer.parseInt(text);
                    case WEIGHT -> refrigerator.weight = Integer.parseInt(text);
                    case FREEZER_CAPACITY ->  refrigerator.freezer_capacity = Integer.parseInt(text);
                    case OVERALL_CAPACITY -> refrigerator.overall_capacity = Integer.parseInt(text);
                    case HEIGHT -> refrigerator.height = Integer.parseInt(text);
                    case WIDTH -> refrigerator.width = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return refrigerator;
    }
}
