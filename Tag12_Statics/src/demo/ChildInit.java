package demo;

public class ChildInit extends ParentInit {
	static {
		System.out.println("[STATIC] Calling Static block class ChildInit");
	}
	
	{
		System.out.println("[NOT_STATIC] Calling Not Static block class ChildInit");
	}
	
	public ChildInit() {
		System.out.println("[INIT] Load Constructor class ChildInit ");
	}
}
