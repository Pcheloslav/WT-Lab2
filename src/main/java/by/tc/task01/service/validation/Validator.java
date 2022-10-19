package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import javax.script.ScriptEngine;
import java.util.Map;

public class Validator {
	
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