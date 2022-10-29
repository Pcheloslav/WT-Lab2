package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

/**
 * Implementation of appliance service that works with
 * appliance dao implementation
 */
public class ApplianceServiceImpl implements ApplianceService{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		// you may add your own code here
		
		return applianceDAO.find(criteria);
	}

}

//you may add your own new classes
