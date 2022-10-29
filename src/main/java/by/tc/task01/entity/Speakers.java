package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the speakers appliance
 */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean mathches(String key, Object value) {
        return switch (SearchCriteria.Speakers.valueOf(key)){
            case POWER_CONSUMPTION -> power_consumption == (Integer)value;
            case NUMBER_OF_SPEAKERS -> number_of_speakers == (Integer)value;
            case FREQUENCY_RANGE -> frequency_range.equals(value);
            case CORD_LENGTH -> cord_length == (Integer)value;
        };
    }
    // you may add your own code here
}
