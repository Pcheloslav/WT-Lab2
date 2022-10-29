package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the refrigerator appliance
 */
public class Refrigerator extends Appliance{

    public int power_consumption;
    public int weight;
    public int freezer_capacity;
    public int overall_capacity;
    public int height;
    public int width;

    @Override
    public String toString(){
        return String.format(
                "POWER_CONSUMPTION=%d, " +
                "WEIGHT=%d, " +
                "FREEZER_CAPACITY=%d, " +
                "OVERALL_CAPACITY=%d, " +
                "HEIGHT=%d, " +
                "WIDTH=%d",
                power_consumption, weight, freezer_capacity, overall_capacity, height, width);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean mathches(String key, Object value) {
        return switch (SearchCriteria.Refrigerator.valueOf(key)){
            case POWER_CONSUMPTION -> power_consumption == (Integer)value;
            case WEIGHT -> weight == (Integer)value;
            case FREEZER_CAPACITY -> freezer_capacity == (Integer)value;
            case OVERALL_CAPACITY -> overall_capacity == (Integer)value;
            case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
            case WIDTH -> width == Double.parseDouble(String.valueOf(value));
        };
    }
    // you may add your own code here
}
