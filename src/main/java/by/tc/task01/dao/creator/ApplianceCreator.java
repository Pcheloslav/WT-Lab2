package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * Represents factory of an appliance from values
 */
public interface ApplianceCreator {
    /**
     * Creates the appliance
     * @param nodes list of an appliances nodes
     * @return a certain type of appliance
     */
    Appliance create(NodeList nodes);
}
