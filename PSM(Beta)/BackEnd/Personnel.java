package BackEnd;

public class Personnel {
	private int N;
	private double Distance;
	
	public Personnel(String a, String b) {
		N = Integer.parseInt(a);
		Distance = Double.parseDouble(b);
	}
	
	public void setN(int a) {
		N = a;
	}
	
	public void setDistance(double b) {
		Distance = b;
	}
	
	public int getN() {
		return N;
	}
	
	public double getDistance() {
		return Distance;
	}
}
