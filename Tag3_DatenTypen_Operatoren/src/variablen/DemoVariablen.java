package variablen;

/**
 * @author RSAL182
 *
 */
public class DemoVariablen {
 
	public static void main(String[] args) {
		
		/**
		 * Boolean(Wahrheitswerte) DateType
		 * */
		
		boolean b1 = true;
		Boolean b2 = true;
		
		//boolean b3 = True; // does not compile True is not keyword
		//Boolean b4 = False; // does not compile False is not keyword
	    boolean b5  = new Boolean("True"); //true
	    Boolean b6 = new Boolean("fAlse"); //false
	    Boolean b7 = new Boolean("abcd");  //false
	    
	    
	    
	    /**
		 * Byte DateType
		 * */
		
	    byte byte1 = 127; 
	    Byte byte2 = 127;
	    
	    //byte byte3 = 128; //does not compile, value is treated as integer since it is out of scope 
	    //Byte byte4 = 128; //does not compile, value is treated as integer since it is out of scope 
	    
	    
	    /**
		 * short DateType
		 * */
	    short short_1 = 10000; 
	    Short short_2 = 8888;
	    //short s3 = 88.2; //does not compile, double has to be created
	    //Short s4 = 88.2; //does not compile, double has to be created
	    
	    short short_3 = (short) 88.2;
	    Short short_4 = (short) 88.2;
	    
	    /**
		 * Char DateType
		 * Einzelnezeichen
		 * */
	    char a = 'a';
	    System.out.println("char c1: " + a);
	    char charMin = Character.MIN_VALUE;
	    System.out.println("charMin " + (int)charMin);
	    char charMax = Character.MAX_VALUE;
	    System.out.println("charMax " + (int)charMax);
	    
	    
		
	    
	    
	    /**
		 * Int DateType
		 * */
		
	    
	    
	    /**
		 * long DateType
		 * */
	    long long_1 = 1000000000000000L;
	    long l12 = 2_147_483_647;
	    /**
		 * double DateType
		 * */
	    
	    
	    /**
		 * float DateType
		 * */
		
		float float_1  = 0.5F;
		
		
		/**
		 * Zeicheinketten
		 * **/
		
		String string_1 = "abc";
		System.out.println("String object value: " + string_1);
		
	}
	
}
