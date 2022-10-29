package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the oven appliance
 */
public class Oven extends Appliance{

    public int power_constumption;
    public int weight;
    public int capacity;
    public int depth;
    public double height;
    public double width;

    @Override
    public String toString(){
        return String.format(
                "POWER_CONSUMPTION=%d, " +
                "WEIGHT=%d, " +
                "CAPACITY=%d, " +
                "DEPTH=%d, " +
                "HEIGHT=%.2f, " +
                "WIDTH=%.2f, ",
                power_constumption, weight, capacity, depth, height, width);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean mathches(String key, Object value) {
        return switch (SearchCriteria.Oven.valueOf(key)){
            case POWER_CONSUMPTION -> power_constumption == (Integer)value;
            case WEIGHT -> weight == (Integer)value;
            case CAPACITY -> capacity == (Integer)value;
            case DEPTH -> depth == (Integer)value;
            case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
            case WIDTH -> width == Double.parseDouble(String.valueOf(value));
        };
    }
}
