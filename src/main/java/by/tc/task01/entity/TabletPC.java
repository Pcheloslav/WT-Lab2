package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.awt.*;
import java.util.Locale;

/**
 * Represents the tablet PC appliance
 */
public class TabletPC extends Appliance{

    public int battery_capacity;
    public int display_inches;
    public int memory_rom;
    public int flash_memory_capacity;
    public Color color;

    @Override
    public String toString(){
        return String.format(
                "BATTERY_CAPACITY=%d, " +
                "DISPLAY_INCHES=%d, " +
                "MEMORY_ROM=%d, " +
                "FLASH_MEMORY=%d, " +
                "COLOR=%s",
                battery_capacity, display_inches, memory_rom, flash_memory_capacity, color.toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean mathches(String key, Object value) {
        Color clr = null;
        if (SearchCriteria.TabletPC.valueOf(key) == SearchCriteria.TabletPC.COLOR){
            try{
                clr = (Color) Color.class.getField(value.toString().toLowerCase(Locale.ROOT)).get(null);
            }
            catch (Exception e){
            }
        }
        return switch (SearchCriteria.TabletPC.valueOf(key)){
            case BATTERY_CAPACITY -> battery_capacity == (Integer)value;
            case DISPLAY_INCHES -> display_inches == (Integer)value;
            case MEMORY_ROM -> memory_rom == (Integer)value;
            case FLASH_MEMORY_CAPACITY -> flash_memory_capacity == (Integer)value;
            case COLOR -> color == clr;
        };
    }
    // you may add your own code here
}
