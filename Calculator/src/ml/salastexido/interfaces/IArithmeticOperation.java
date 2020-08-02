/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.salastexido.interfaces;

/**
 *
 * @author Raul Alejandro Salas Texido  
 */
public interface IArithmeticOperation {
    
    int compute();
    default void appendChild(IArithmeticOperation operation){}
    default void removeChild(IArithmeticOperation operation){}
    
}
