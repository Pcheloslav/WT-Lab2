package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.awt.*;
import java.lang.reflect.Field;

/**
 * Represents creator of a tablet PC appliance
 */
public class TabletPCCreator implements ApplianceCreator {

    private static final String BATTERY_CAPACITY = "batteryCapacity";
    private static final String DISPLAY_INCHES = "displayInches";
    private static final String MEMORY_ROM = "memoryRom";
    private static final String FLASH_MEMORY_CAPACITY = "flashMemoryCapacity";
    private static final String COLOR = "color";

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(NodeList nodes) {
        TabletPC tabletPC = new TabletPC();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case BATTERY_CAPACITY -> tabletPC.battery_capacity = Integer.parseInt(text);
                    case DISPLAY_INCHES -> tabletPC.display_inches = Integer.parseInt(text);
                    case MEMORY_ROM -> tabletPC.memory_rom = Integer.parseInt(text);
                    case FLASH_MEMORY_CAPACITY -> tabletPC.flash_memory_capacity = Integer.parseInt(text);
                    case COLOR -> {
                        try {
                            tabletPC.color = (Color) Color.class.getField(text).get(null);
                        } catch (Exception e) {
                            tabletPC = null;
                        }
                    }
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return tabletPC;
    }
}
