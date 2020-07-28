/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Division implements IArithmetic {

	private final Fraction x;
	private final Fraction y;
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Division(final Fraction x, final Fraction y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public Fraction compute() {
		//the Division of the two Fractions is the product(x,inverse(y))
		Fraction fractionResult = new Fraction();
		Fraction inverse = y.inverse(y);
		fractionResult.setNumerator(x.getNumerator()*inverse.getNumerator());
		fractionResult.setDenominator(x.getDenominator()*inverse.getDenominator());
		return fractionResult;
	}
	@Override
	public String toString() {
		return ":";
	}
	

}
