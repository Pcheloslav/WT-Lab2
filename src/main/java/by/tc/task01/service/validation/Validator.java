package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import javax.script.ScriptEngine;
import java.util.Map;

/**
 * Validator class for single criteria
 */
public class Validator {

	/**
	 * Validates the criteria by its search criteria
	 * @param criteria criteria to validate
	 * @return true of criteria is valid, else - false
	 */
	public static boolean criteriaValidator(Criteria criteria) {

		if (criteria == null || criteria.getSearchCriteria() == null)
			return false;

		var searchCriteria = criteria.getSearchCriteria();

		for (var entry: searchCriteria.entrySet()){
			var key = entry.getKey();
			var value = entry.getValue();

			ValueValidator validator = ValueValidatorFactory.getInstance().getValidator(key);
			boolean isValid = validator.validate(value);
			if (!isValid)
				return false;
		}
		return true;
	}

}

//you may add your own new classes