package by.tc.task01.entity;

public class Speakers extends Appliance{

    public int power_consumption;
    public int number_of_speakers;
    public String frequency_range;
    public int cord_length;

    @Override
    public String toString(){
        return String.format(
                "POWER_CONSUMPTION=%d, " +
                "NUMBER_OF_SPEAKERS=%d, " +
                "FREQUENCY_RANGE=%s, " +
                "CORD_LENGTH=%d",
                power_consumption, number_of_speakers, frequency_range, cord_length);
    }

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }

}
