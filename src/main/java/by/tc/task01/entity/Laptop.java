package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{

    public double batteryCapacity;
    public String os;
    public int memoryRom;
    public int systemMemory;
    public double cpu;
    public int displayInchs;

    @Override
    public String toString(){
        return String.format(
                "Laptop: BATTERY_CAPACITY=%.1f, " +
                "OS=$s, " +
                "MEMORY_ROM=%d, " +
                "SYSTEM_MEMORY=%d, " +
                "CPU=%.1f, " +
                "DISPLAY_INCHS=%d",
                batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }

    @Override
    public boolean mathches(String key, Object value) {
        return false;
    }

}
