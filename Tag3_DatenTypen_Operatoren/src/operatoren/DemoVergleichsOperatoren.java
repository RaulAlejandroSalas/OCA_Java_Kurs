package operatoren;
public class DemoVergleichsOperatoren {
	
	
	public static void main(String[] args) {
		
		Kunde k1 = new Kunde();
		Kunde k2 = new Kunde();
		
		System.out.println("Referenz Vergleich");
		System.out.println("k1 == k2 " + (k1.equals(k2)));
	
	}
}
