/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public interface IArithmetic {
	
	Fraction compute();
	default void appendChild(IArithmetic arithmetic) {}
	default void removeChild(IArithmetic arithmetic) {}

}
