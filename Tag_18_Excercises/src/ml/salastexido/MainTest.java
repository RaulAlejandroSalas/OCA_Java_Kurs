package ml.salastexido;

public class MainTest {
	public static void main(String[] args) {
		C1 o1;
		C2 o2;
		C3 o3= new C3();
		
		//o3 = o2; 
		
		I1 i1 = o3; //correct
		I2 i2 = (I2) i1;
		
		I1 b = o3; //correct
		
	}
}
