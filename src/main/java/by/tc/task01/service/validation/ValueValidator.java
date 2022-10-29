package by.tc.task01.service.validation;

/**
 * Interface of a simple value validator
 */
public interface ValueValidator {

    /**
     * Validates single value
     * @param obj value to validate
     * @return true if value is valid, else - false
     */
    boolean validate(Object obj);

}
