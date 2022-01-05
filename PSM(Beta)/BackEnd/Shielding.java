package BackEnd;

public class Shielding {
	private String TypeOfShielding = "";
	private double MAC=0;
	private double density = 0;
	private double BuildupFactor = 0;
	
	public Shielding(String a,String b,String c,String d) {
		TypeOfShielding=a.toUpperCase();
		MAC=Double.parseDouble(b);
		density=Double.parseDouble(c);
		BuildupFactor=Double.parseDouble(d);
		
	}
	
	//MAC=Mass Attenuation Coefficient
	public void setType(String a) {
		TypeOfShielding=a;
	}
	
	public void setMAC(double b) {
		MAC=b;
	}
	
	public void setDensity(double c) {
		density = c;
	}
	
	public void setBuildupFactor(double a) {
		BuildupFactor=a;
	}
	
	public String getType() {
		return TypeOfShielding.toUpperCase();
	}
	
	public double getMAC() {
		return MAC;
	}
	
	public double getDensity() {
		return density;
	}
	
	public double getBuildupFactor() {
		return BuildupFactor;
	}
}
