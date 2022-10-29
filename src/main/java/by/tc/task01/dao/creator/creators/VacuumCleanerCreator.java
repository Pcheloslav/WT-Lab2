package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Locale;

/**
 * Represents creator of a vacuum cleaner appliance
 */
public class VacuumCleanerCreator implements ApplianceCreator {

    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String FILTER_TYPE = "filterType";
    private static final String BAG_TYPE = "bagType";
    private static final String WAND_TYPE = "wandType";
    private static final String MOTOR_SPEED_REGULATION = "motorSpeedRegulation";
    private static final String CLEANING_WIDHT = "cleaningWidth";

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(NodeList nodes) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        for (int i = 0; i < nodes.getLength(); i++){
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()){
                    case POWER_CONSUMPTION -> vacuumCleaner.power_consumption = Integer.parseInt(text);
                    case FILTER_TYPE -> vacuumCleaner.filter_type = VacuumCleaner.FilterType.valueOf(text.toUpperCase());
                    case BAG_TYPE -> vacuumCleaner.bag_type = text;
                    case WAND_TYPE -> vacuumCleaner.wand_type = text;
                    case MOTOR_SPEED_REGULATION -> vacuumCleaner.motor_speed_regulation = Integer.parseInt(text);
                    case CLEANING_WIDHT -> vacuumCleaner.cleaning_width = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance extst");
                }
            }
        }
        return vacuumCleaner;
    }
}
