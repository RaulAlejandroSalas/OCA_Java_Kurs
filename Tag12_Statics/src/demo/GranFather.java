package demo;

public class GranFather {

	static {
		System.out.println("[STATIC] Calling Static block class GrandFather");
	}
	
	{
		System.out.println("[NOT_STATIC] Calling Not Static block class GrandFather");
	}
	
	
	public GranFather() {
		System.out.println("[INIT] Load Constructor class GranFather ");
	}
}
