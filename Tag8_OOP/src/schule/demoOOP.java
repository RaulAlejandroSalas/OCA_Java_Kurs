package schule;

public class demoOOP {
	
	int value = 1;
	demoOOP link;
	
	demoOOP(int val){
		this.value = val;
	}
	public static void main(String[] args) {
		
		final demoOOP a = new demoOOP(5);
		demoOOP b = new demoOOP(10);
		a.link = b;
		

		
	}
	
		
}
