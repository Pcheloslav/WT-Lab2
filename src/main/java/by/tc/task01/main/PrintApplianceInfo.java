package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

/**
 * Class for printing results
 */
public class PrintApplianceInfo {

	/**
	 * Prints the information about all found appliances
	 * If list is empty "No appliances found" is printed
	 * @param appliance return value appliance service find method
	 */
	public static void print(List<Appliance> appliance) {
		if (appliance == null)
			System.out.println("Can not find result with this parameters");
		else
			for (Appliance appl: appliance) {
				System.out.println(appl.toString());
			}

		
	}
}
