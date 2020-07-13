package demo;

public class DemoTest {

	static{
		System.out.println("[STATIC] Calling Static block class DemoTest");
	}
	
	{
		System.out.println("[NOT_STATIC] Calling Static block class DemoTest");
	}
	
	public static void main(String[] args) {
		System.out.println("Start Program...");
		new ChildInit();
		System.out.println("End Program...");
	}
	
}
