package BackEnd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GUI implements ActionListener {
	
	private static JLabel SourceTitle;
	private static JLabel TypeOfSource;
	private static JLabel TypeOfEmission;
	private static JLabel DesignResult;
	private static JTextField Type;
	private static JTextField EmiType;
	private static JButton Design;
	private static JLabel SpecificActivityLabel;
	private static JTextField SpecificActivityValue;
	private static JLabel EnergyLabel;
	private static JTextField EnergyValue;
	private static JLabel ShieldingTitle;
	private static JLabel ShieldingTypeLabel;
	private static JTextField ShieldingName;
	private static JLabel MACLabel;
	private static JTextField MACValue;
	private static JLabel DensityLabel;
	private static JTextField DensityValue;
	private static JLabel BFLabel;
	private static JTextField BFValue;
	private static JLabel PersonnelTitle;
	private static JLabel NLabel;
	private static JTextField NValue;
	private static JLabel DistanceLabel;
	private static JTextField DistanceValue;
	private static JLabel TLabel;
	private static JTextField TValue;
	private static JLabel PLabel;
	private static JTextField PValue;
	private static JTable TTableGUI;
	private static JTable PTableGUI;
	private static JLabel TTableTitle;
	private static JLabel PTableTitle;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Double> TTable = new HashMap<Integer, Double>();
		TTable.put(1 , 1.0);
		TTable.put(2 , 0.5);
		TTable.put(3 , 0.2);
		TTable.put(4 , 0.125);
		TTable.put(5 , 0.05);
		TTable.put(6 , 0.025);
		
		HashMap<Integer,Double> PTable = new HashMap<Integer,Double>();
		PTable.put(1,0.02);
		PTable.put(2,0.01);
		
		JFrame frame = new JFrame();
		frame.setSize(900,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		
		SourceTitle = new JLabel("Source of Radiation");
		SourceTitle.setBounds(10,20,150,25);
		panel.add(SourceTitle);
		
		TypeOfSource = new JLabel("Source:");
		TypeOfSource.setBounds(10,50,100,25);
		panel.add(TypeOfSource);
		
		Type = new JTextField(20);
		Type.setBounds(120,50,165,25);
		panel.add(Type);
		
		TypeOfEmission = new JLabel("Emission:");
		TypeOfEmission.setBounds(10,80,100,25);
		panel.add(TypeOfEmission);
		
		EmiType = new JTextField(20);
		EmiType.setBounds(120,80,165,25);
		panel.add(EmiType);
		
		SpecificActivityLabel = new JLabel("SpecificActivity(Ci/g):");
		SpecificActivityLabel.setBounds(10,110,100,25);
		panel.add(SpecificActivityLabel);
		
		SpecificActivityValue = new JTextField(20);
		SpecificActivityValue.setBounds(120,110,165,25);
		panel.add(SpecificActivityValue);
		
		EnergyLabel = new JLabel("Energy(MeV):");
		EnergyLabel.setBounds(10,140,100,25);
		panel.add(EnergyLabel);
		
		EnergyValue = new JTextField(20);
		EnergyValue.setBounds(120,140,165,25);
		panel.add(EnergyValue);
		
		Design = new JButton("Design");
		Design.setBounds(10,170,80,25);
		Design.addActionListener(new GUI());
		panel.add(Design);
		
		ShieldingTitle = new JLabel("Radiation Shielding");
		ShieldingTitle.setBounds(290,20,150,25);
		panel.add(ShieldingTitle);
		
		ShieldingTypeLabel = new JLabel("Material:");
		ShieldingTypeLabel.setBounds(290,50,100,25);
		panel.add(ShieldingTypeLabel);
		
		ShieldingName = new JTextField(20);
		ShieldingName.setBounds(400,50,165,25);
		panel.add(ShieldingName);
		
		MACLabel = new JLabel("MAC(cm2/g):");
		MACLabel.setBounds(290,80,100,25);
		panel.add(MACLabel);
		
		MACValue = new JTextField(20);
		MACValue.setBounds(400,80,165,25);
		panel.add(MACValue);
		
		DensityLabel = new JLabel("Density(g/cm3):");
		DensityLabel.setBounds(290,110,100,25);
		panel.add(DensityLabel);
		
		DensityValue = new JTextField(20);
		DensityValue.setBounds(400,110,165,25);
		panel.add(DensityValue);
		
		BFLabel = new JLabel("BuildupFactor:");
		BFLabel.setBounds(290,140,100,25);
		panel.add(BFLabel);
		
		BFValue = new JTextField(20);
		BFValue.setBounds(400,140,165,25);
		panel.add(BFValue);
		
		PersonnelTitle = new JLabel("Personnel Involved");
		PersonnelTitle.setBounds(580,20,150,25);
		panel.add(PersonnelTitle);
		
		NLabel = new JLabel("Sum of Personnel/week:");
		NLabel.setBounds(580,50,150,25);
		panel.add(NLabel);
		
		NValue = new JTextField(20);
		NValue.setBounds(730,50,150,25);
		panel.add(NValue);
		
		DistanceLabel = new JLabel("Distance(m):");
		DistanceLabel.setBounds(580,80,150,25);
		panel.add(DistanceLabel);
		
		DistanceValue = new JTextField(20);
		DistanceValue.setBounds(730,80,150,25);
		panel.add(DistanceValue);
		
		TLabel = new JLabel("T Class:");
		TLabel.setBounds(580,110,150,25);
		panel.add(TLabel);
		
		TValue = new JTextField(20);
		TValue.setBounds(730,110,150,25);
		panel.add(TValue);
		
		PLabel = new JLabel("P Class:");
		PLabel.setBounds(580,140,150,25);
		panel.add(PLabel);
		
		PValue = new JTextField(20);
		PValue.setBounds(730,140,150,25);
		panel.add(PValue);
		
		DesignResult = new JLabel("");
		DesignResult.setBounds(10,200,800,25);
		panel.add(DesignResult);
		
		String [] columns = {"Class","Description","T Value"};
		String [][] data = {{"1","Offices, Lab, and other work areas; children indoor play areas, X-ray control room","1"},
				{"2","Patient examination and treatment rooms","0.5"},
				{"3","Corridors; patient rooms, staff lounges and rest rooms","0.2"},
				{"4","Corridor door areas","0.125"},
				{"5","Unattended waiting rooms and vending areas; storage areas; public toilets;outdoor areas with seating","0.05"},
				{"6","Attics; Stairways; janitor closets;unattended elevators and parking lots; out-door areas with only transient pedestrians or vehicular traffic","0.025"}
		};
		
		TTableGUI = new JTable(data,columns)
		{
			public boolean isCellEditable(int data,int columns) 
			{
				return false;
			}
		};
		
		TTableGUI.setBackground(Color.white);
		TTableGUI.setForeground(Color.black);
		TTableGUI.setSelectionBackground(Color.red);
		TTableGUI.setGridColor(Color.red);
		TTableGUI.setSelectionForeground(Color.white);
		TTableGUI.setFont(new Font("Tahoma",Font.PLAIN,17));
		TTableGUI.setPreferredScrollableViewportSize(new Dimension(200,200));
		TTableGUI.setFillsViewportHeight(true);
		TTableGUI.setRowHeight(30);
		TTableGUI.setAutoCreateRowSorter(true);
	
		JScrollPane pane = new JScrollPane(TTableGUI);
		pane.setForeground(Color.red);
		pane.setBackground(Color.white);
		
		pane.setBounds(10,270,400,200);
		panel.add(pane);
		
		String [] PColumns = {"Class","Desription","P Value(mGy/Wk)"};
		String [][] PData = {
				{"1","Controlled Area","0.01"},
				{"2","Uncontrolled Area","0.02"}
				};
		
		PTableGUI = new JTable(PData,PColumns)
		{
			public boolean isCellEditable(int PData,int PColumns) 
			{
				return false;
			}
		};
		
		PTableGUI.setBackground(Color.white);
		PTableGUI.setForeground(Color.black);
		PTableGUI.setSelectionBackground(Color.red);
		PTableGUI.setGridColor(Color.red);
		PTableGUI.setSelectionForeground(Color.white);
		PTableGUI.setFont(new Font("Tahoma",Font.PLAIN,17));
		PTableGUI.setPreferredScrollableViewportSize(new Dimension(200,200));
		PTableGUI.setFillsViewportHeight(true);
		PTableGUI.setRowHeight(30);
		PTableGUI.setAutoCreateRowSorter(true);
	
		JScrollPane Ppane = new JScrollPane(PTableGUI);
		Ppane.setForeground(Color.red);
		Ppane.setBackground(Color.white);
		
		Ppane.setBounds(440,270,400,200);
		panel.add(Ppane);
		
		TTableTitle = new JLabel("T Table");
		TTableTitle.setBounds(10,240,150,25);
		panel.add(TTableTitle);
		
		PTableTitle = new JLabel("P Table");
		PTableTitle.setBounds(440,240,150,25);
		panel.add(PTableTitle);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Source s = new Source(Type.getText(),EmiType.getText(),SpecificActivityValue.getText(),EnergyValue.getText());
		System.out.println(s.getType());
		System.out.println(s.getEmission());
		System.out.println(s.getSpecificActivity());
		System.out.println(s.getEnergy());
		
		Shielding sh = new Shielding(ShieldingName.getText(),MACValue.getText(),DensityValue.getText(),BFValue.getText());
		System.out.println(sh.getType());
		System.out.println(sh.getMAC());
		System.out.println(sh.getDensity());
		System.out.println(sh.getBuildupFactor());
		
		Personnel p = new Personnel(NValue.getText(),DistanceValue.getText());
		System.out.println(p.getN());
		System.out.println(p.getDistance());
		
		switch(s.getEmission()) {
		case "GAMMA":
			System.out.println("Pending");
			break;
			
		case "XRAY":
			HashMap<Integer, Double> TTable = new HashMap<Integer,Double>();
			TTable.put(1 , 1.0);
			TTable.put(2 , 0.5);
			TTable.put(3 , 0.2);
			TTable.put(4 , 0.125);
			TTable.put(5 , 0.05);
			TTable.put(6 , 0.025);
			
			/*
			 * Type 1: Offices, Lab, and other work areas; children indoor play areas, X-ray control room
			 * Type 2: Patient examination and treatment rooms
			 * Type 3: Corridors; patient rooms, staff lounges and rest rooms
			 * Type 4: Corridor door areas
			 * Type 5: Unattended waiting rooms and vending areas; storage areas; public toilets;outdoor areas with seating
			 * Type 6: Attics; Stairways; janitor closets;unattended elevators and parking lots; out-door areas with only transient pedestrians or vehicular traffic
			 */
			
			
			HashMap<Integer, Double> PTable = new HashMap<Integer,Double>();
			PTable.put(1,0.02);
			PTable.put(2,0.01);
			
			/*
			 * Type 1: Uncontrolled Area
			 * Type 2: Controlled Area
			 */
			
			int Tnum = Integer.parseInt(TValue.getText());
			Double T = TTable.get(Tnum);
			int Pnum = Integer.parseInt(PValue.getText());
			Double P = PTable.get(Pnum);
			double thickness = (p.getN()*T/(P*p.getDistance()*p.getDistance()));
			DesignResult.setText("Primary Shielding Thickness: "+ thickness+"mm "+sh.getType());
		
			break;
		default:
			DesignResult.setText("NOT A VALID EMISSION");
		
	}
	}
}
