/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Multiplication implements IArithmetic {

	private final Fraction x;
	private final Fraction y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Multiplication(final Fraction x, final Fraction y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public Fraction compute() {
		Fraction fractionResult = new Fraction();
		fractionResult.setNumerator(x.getNumerator()*y.getNumerator());
		fractionResult.setDenominator(x.getDenominator()*y.getDenominator());
		return fractionResult;
	}

}
