/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this.numerator=0;
		this.denominator=1;
	}
	
	//Integer Fraction Constructor
	public Fraction(final int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	//General Constructor
	public Fraction(final int numerator, final int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//change numerator by denominator
	public Fraction inverse(Fraction x) {
		return (x.getNumerator()>=0) ? new Fraction(x.getDenominator(),x.getNumerator())
				: new Fraction(-x.getDenominator(),-x.getNumerator());
	}

	@Override
	public String toString() {
		return (this.getDenominator()==1)? " "
				+this.getNumerator(): this.getNumerator()+ "/" + this.getDenominator();
	}

	
	
}
