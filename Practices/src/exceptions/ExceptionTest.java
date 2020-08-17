package exceptions;

class NewException extends Exception{}
class OtherException extends Exception{}

public class ExceptionTest {

	public static void m2() throws NewException{
		System.out.println("Calling M2 Method...");
		throw new NewException();
	};
	public static void m3() throws OtherException{
		System.out.println("Calling M3 Method...");
		throw new OtherException();
	};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			m2();
		}
		finally {m3();}

	}

}
