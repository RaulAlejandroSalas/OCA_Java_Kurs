package exceptions;

public class ExceptionTestII {
	
	
	public void method(Object o) {
		System.out.println("Object version");
	}
	
    public void method(java.io.IOException s) {
		System.out.println("Object version");
	}
	
	public void method(java.io.FileNotFoundException s) {
		System.out.println("java.io.FileNotFoundException");
	}
	
	
	
	
 public static void main(String[] args) {
	 ExceptionTestII exceptionTestII = new ExceptionTestII();
	 exceptionTestII.method(null);
	
}
}
