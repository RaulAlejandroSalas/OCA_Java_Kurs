package ml.salastexido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CalculatorTest {
	
	private final static Scanner scanner = new Scanner(System.in);

	public static Fraction readFractionFromKeyBoard() {
		String numeratorString = new String("");
		String denominatorString= new String("");
		//create Fraction Object Instance
		Fraction fraction;
		System.out.println("Enter a Fraction:");
		
		String fractionDto = scanner.nextLine();
		
		//finding the position of the character /
		int pos = fractionDto.indexOf('/');
		if(pos!=-1) {
			for(int i=0;i<pos;i++) {
				numeratorString+=fractionDto.charAt(i);
			}
			for(int i=(pos+1);i<fractionDto.length();i++) {
				denominatorString+=fractionDto.charAt(i);
			}
			//convert Strings to integers
			int numerator = Integer.valueOf(numeratorString.trim()).intValue();
			int denominator = Integer.valueOf(denominatorString.trim()).intValue();
			fraction = new Fraction(numerator,denominator);
		}
		else {
			fraction = new Fraction(Integer.valueOf(fractionDto.trim()).intValue());
		}	
		
		//scanner.close();
		return fraction;
	}
	
	public static void showResults(Fraction f1,Fraction f2, String operator, Fraction result) {
		System.out.println(f1 +" " + operator + " "+ f2 + " = " + result);
	}
	
	
	public static void main(String[] args) {
		
		Fraction fraction1 = readFractionFromKeyBoard();
		Fraction fraction2 = readFractionFromKeyBoard();
		scanner.close();
		
		List<IArithmetic> operations = new ArrayList<>(); 
		operations.add(new Addition(fraction1,fraction2));
		operations.add(new Multiplication(fraction1,fraction2));
		operations.add(new Division(fraction1,fraction2));
		operations.add(new Substraction(fraction1,fraction2));
		
		Iterator<IArithmetic> it = operations.iterator();
		while(it.hasNext()) {
			IArithmetic operation = it.next();
			showResults(fraction1,fraction2,operation.toString(),operation.compute());
		}
		

		
		
	}
}
