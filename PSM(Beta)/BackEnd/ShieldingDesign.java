package BackEnd;
import java.util.HashMap;


public class ShieldingDesign {

	public static void main(String[] args) {
		
		public double thickness = 0;
		//thickness of shielding
		
		public double P = 0;
		//Design Goal, P (Mgy/wk)
		
		public double T = 0;
		//Occupancy Factor
		
		public double distance2area = 0;
		//distance to occupied area (m)
		
		HashMap<Integer, Double> TTable = new HashMap<Integer, Double>();
		TTable.put(1 , 1.0);
		TTable.put(2 , 0.5);
		TTable.put(3 , 0.2);
		TTable.put(4 , 0.125);
		TTable.put(5 , 0.05);
		TTable.put(6 , 0.025);
		/*
		 * Type 1: Offices, Lab, and other work areas; children indoor play areas, X-ray control rool
		 * Type 2: Patient examination and treatment rooms
		 * Type 3: Corridors; patient roomsl staff lounges and rest rooms
		 * Type 4: Corridor door areas
		 * Type 5: Unattended waiting rooms and vending areas; storage areas; public toilets;outdoor areas with seating
		 * Type 6: Attics; Stairways; janitor closets;unattended elevators and parking lots; out-door areas with only transient pedestrians or vehicular traffic
		 */
		
		HashMap<Integer,Double> PTable = new HashMap<Integer,Double>();
		PTable.put(1,0.02);
		PTable.put(2,0.01);
		/*
		 * Type 1: Uncontrolled Area
		 * Type 2: Controlled Area
		 */
		
		System.out.println(TTable);
		System.out.println(PTable);
		
	}

}
