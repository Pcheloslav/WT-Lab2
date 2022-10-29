package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of an appliacne service
 */
public interface ApplianceService {

	/**
	 * Validates criteria and finds all the appliances
	 * that mathc all given criteris
	 * @param criteria criteria to match for
	 * @return appliance array that mathced the criteria or null if criteria is invalid
	 */
	List<Appliance> find(Criteria criteria);
	
}
