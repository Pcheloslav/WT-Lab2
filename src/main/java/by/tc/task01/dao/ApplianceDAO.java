package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of an appliance dao class
 */
public interface ApplianceDAO {
	/**
	 * Finds all the appliances that match the given criteria
	 * @param criteria criteria that appliance must meet
	 * @return list of appliances that match the criteria or null if criteria is invalid
	 */
	List<Appliance> find(Criteria criteria);
}
