package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a speaker appliance
 */
public class SpeakersCreator implements ApplianceCreator {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String NUMBER_OF_SPEAKERS = "numberOfSpeakers";
    private static final String FREQUENCY_RANGE = "frequenceRange";
    private static final String CORD_LENGTH = "cordLength";

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(NodeList nodes) {
        Speakers speakers = new Speakers();

        for (int i = 0; i < nodes.getLength(); i++){
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()){
                    case POWER_CONSUMPTION -> speakers.power_consumption = Integer.parseInt(text);
                    case NUMBER_OF_SPEAKERS -> speakers.number_of_speakers = Integer.parseInt(text);
                    case FREQUENCY_RANGE -> speakers.frequency_range = text;
                    case CORD_LENGTH -> speakers.cord_length = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return speakers;
    }
}
