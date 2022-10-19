package by.tc.task01.entity;

import java.awt.*;

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

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }

}
