package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the vacuum cleaner appliance
 */
public class VacuumCleaner extends Appliance{

    public enum FilterType{
        A, B, C
    }

    public int power_consumption;
    public FilterType filter_type;
    public String bag_type;
    public String wand_type;
    public int motor_speed_regulation;
    public int cleaning_width;

    @Override
    public String toString(){
        return String.format(
                "POWER_CONSUMPTION=%d, " +
                "FILTER_TYPE=%s, " +
                "BAG_TYPE=%s, " +
                "WAND_TYPE=%s, " +
                "MOTOR_SPEED_REGULATION=%d, " +
                "CLEANING_WIDTH=%d",
                power_consumption, filter_type.toString(), bag_type, wand_type, motor_speed_regulation, cleaning_width);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean mathches(String key, Object value) {
        return switch (SearchCriteria.VacuumCleaner.valueOf(key)){
            case POWER_CONSUMPTION -> power_consumption == (Integer)value;
            case FILTER_TYPE -> filter_type == FilterType.valueOf((String) value);
            case BAG_TYPE -> bag_type.equals(value);
            case WAND_TYPE -> wand_type.equals(value);
            case MOTOR_SPEED_REGULATION -> motor_speed_regulation == (Integer)value;
            case CLEANING_WIDTH -> cleaning_width == (Integer)value;
        };
    }
    // you may add your own code here
}
