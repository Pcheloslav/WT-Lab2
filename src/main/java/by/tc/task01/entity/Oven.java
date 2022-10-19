package by.tc.task01.entity;

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

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }
}
