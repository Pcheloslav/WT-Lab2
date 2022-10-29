package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.awt.*;
import java.util.List;

/**
 * Main class of a console program
 */
public class Main {

	/**
	 * Mait method
	 * @param args console arguments
	 */
	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		appliances = service.find(criteriaOven);
		PrintApplianceInfo.print(appliances);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);
		appliances = service.find(criteriaOven);
		PrintApplianceInfo.print(appliances);
		System.out.println();

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
		appliances = service.find(criteriaTabletPC);// find(Object...obj)
		PrintApplianceInfo.print(appliances);
		System.out.println();

		/////////////////////////////////////////////////////////////////

		Criteria critetiaCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		critetiaCleaner.add(VacuumCleaner.WAND_TYPE.toString(), "all-in-one");
		appliances = service.find(critetiaCleaner);
		PrintApplianceInfo.print(appliances);
		System.out.println();
	}

}
