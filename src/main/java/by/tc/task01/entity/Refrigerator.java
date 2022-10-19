package by.tc.task01.entity;

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

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }

}
