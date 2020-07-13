package hackerrank_excersices;

public class test {
	
	public static String staticString;
	
	static int max(int a, int b) {
		return b^((a^b) & -((a < b) ? 0 :1));
	}
	static int min(int a, int b) {
		return a^((a^b) & -((a < b) ? 0 :1));
	}
	
	static {
		staticString = "Hallo";
	}
	
	public static void main(String[] args) {
			int a = 777777;
			int b = 8888;
			System.out.println(max(a,b));
			System.out.println(min(a,b));	
			System.out.println("(" + a + "," + b+ ")");
			a = a^b;
			b = a^b;
			a = a^b;
			System.out.println("(" + a + "," + b+ ")");
	}
}
