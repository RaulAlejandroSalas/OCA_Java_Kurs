/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.salastexido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ml.salastexido.interfaces.IArithmeticOperation;

/**
 *
 * @author raul
 */
public class CompositeEqualOperation implements IArithmeticOperation{

    private final List<IArithmeticOperation> operations = new ArrayList<>();

    public CompositeEqualOperation(IArithmeticOperation... arithmetics){
        operations.addAll(Arrays.asList(arithmetics));
    }
    
    
    @Override
    public int compute() {
       int result = 0;
       for(int i=0;i<=operations.size();i++){
           result = operations.get(i).compute();
       }
       return result;
    }

    @Override
    public void appendChild(IArithmeticOperation operation) {
       operations.add(operation);
    }

    @Override
    public void removeChild(IArithmeticOperation operation) {
        operations.remove(operation);
    }
    
    
}
