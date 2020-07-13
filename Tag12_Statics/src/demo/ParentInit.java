package demo;

public class ParentInit extends GranFather{
	
	static {
		System.out.println("[STATIC] Calling Static block class ParentInit");
	}
	
	{
		System.out.println("[NOT_STATIC] Calling Not Static block class ParentInit");
	}
	
	public ParentInit() {
		System.out.println("[INIT] Load Constructor class ParentInit ");
	}
}
