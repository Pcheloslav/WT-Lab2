package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * The Criteria class represents search criteria
 * on a single field of an appliance
 */
public class Criteria {

	/**
	 * Backing field of seatch type
	 */
	private String groupSearchName;

	/**
	 * Backing field of search criteria
	 */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Instantiates object of a type Criteria
	 * @param groupSearchName search type
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Gets the search type
	 * @return search type
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new search criteria
	 * @param searchCriteria field to search
	 * @param value search criteria value
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * Gets the search criteria
	 * @return search criteria
	 */
	public Map<String, Object> getSearchCriteria(){
		return criteria;
	}

}
