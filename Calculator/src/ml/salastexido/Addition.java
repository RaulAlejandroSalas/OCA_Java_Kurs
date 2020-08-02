/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.salastexido;

import ml.salastexido.interfaces.IArithmeticOperation;

/**
 *
 * @author Raul Alejandro Salas Texido
 */
public class Addition implements IArithmeticOperation{

    private final int x;
    private final int y;
    
    public Addition(final int x, final int y)
    {
        this.x =x;
        this.y = y;
    }
    
    @Override
    public int compute() {
        return x+y;
    }

  
}
