package by.tc.task01.entity;

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

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }

}
