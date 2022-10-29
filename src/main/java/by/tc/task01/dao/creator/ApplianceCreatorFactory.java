package by.tc.task01.dao.creator;

import by.tc.task01.dao.creator.creators.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory of appliance creator
 */
public class ApplianceCreatorFactory {

    private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();

    private Map<String, ApplianceCreator> creators = new HashMap<>();

    private ApplianceCreatorFactory() {
        creators.put("laptop", new LaptorCreator());
        creators.put("oven", new OvenCreator());
        creators.put("refrigerator", new RefrigeratorCreator());
        creators.put("speakers", new SpeakersCreator());
        creators.put("tabletPC", new TabletPCCreator());
        creators.put("vacuumCleaner", new VacuumCleanerCreator());
    }

    /**
     * Gets the instance of a factory
     * @return factory instance
     */
    public static ApplianceCreatorFactory getInstance(){
        return instance;
    }

    /**
     * Gets the creator of a certain type appliance from its name
     * @param applianceName name of an appliance
     * @return appliance creator
     * @throws IllegalArgumentException if appliances name matches no creators
     */
    public ApplianceCreator getCreator(String applianceName){
        return creators.get(applianceName);
    }
}
