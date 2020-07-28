/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 * 
 */
public class Addition implements IArithmetic{

	private final Fraction x;
	private final Fraction y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Addition(final Fraction x, final Fraction y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Fraction compute() {
		Fraction fractionResult = new Fraction();
		// xn/xd + yn/yd = (xn*yd)+(xd*yn)
		fractionResult.setNumerator((x.getNumerator()*y.getDenominator())
									+(x.getDenominator()*y.getNumerator()));
		
		fractionResult.setDenominator(x.getDenominator()*y.getDenominator());
		return fractionResult;
	}

}
