/**
 * 
 */
package ml.salastexido.exceptions;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class DivideByZeroException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DivideByZeroException() {
		super();
	}
	
	public DivideByZeroException(String s) {
		super(s);
	}

}
