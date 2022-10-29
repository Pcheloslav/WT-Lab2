package by.tc.task01.entity;

/**
 * Represents a single object of appliance of the shop
 */
public abstract class Appliance {
	// you may add your own code here

    /**
     * Returns true if appliance matches the given search criteria
     * Method should be overridden in child class
     * @param key field to match for
     * @param value value of field
     * @return true if appliance matches the given criteria, else - false
     */
    public abstract boolean mathches(String key, Object value);

}
