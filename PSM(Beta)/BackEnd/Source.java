package BackEnd;
import java.util.Scanner;

public class Source {
		private String TypeOfSource;
		private String Emission;
		private double SpecificActivity;
		private double Energy;
		
		public Source(String a, String b, String c, String d) {
			TypeOfSource=a.toUpperCase();
			Emission=b.toUpperCase();
			SpecificActivity=Double.parseDouble(c);
			Energy=Double.parseDouble(d);
		}
		
		public void setType(String a) {
			TypeOfSource = a;
		}
		
		public void setEmission(String a) {
			Emission=a;
		}
		
		public void setSpecificActivity(double a) {
			SpecificActivity = a;
		}
		
		public void setEnergy(double b) {
			Energy = b;
		}
		
		public String getType() {
			return TypeOfSource.toUpperCase();
		}
		
		public String getEmission() {
			return Emission.toUpperCase();
		}
		
		public double getSpecificActivity() {
			return SpecificActivity;
		}
		
		public double getEnergy() {
			return Energy;
		}
}
