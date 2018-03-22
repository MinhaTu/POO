/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author 397429
 */
public class CalcTest {
    Calculadora calc;
    int numCasos;
    public CalcTest(int numCasos){
        Calculadora calc = new Calculadora();
        numCasos = this.numCasos;
    }
    public boolean testarSum(){
        if(calc.sum(5, 10*3) != (5+(10*3))){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean testarMinus(){
        float resultado;
        for(int i = 0; i < numCasos; ++i){
            resultado = calc.minus(5, 10*i);
            if(resultado != (5-(10*i))){
                return false;
            }
        }
        return true;
    }
    
    public boolean testarTimes(){
        float resultado;
        for(int i = 0; i < numCasos; ++i){
            resultado = calc.times(5, 10*i);
            if(resultado != (5*(10*i))){
                return false;
            }
        }
        return true;
    }
    public boolean testarDivides(){
        float resultado;
        for(int i = 0; i < numCasos; ++i){
            resultado = calc.divides(5, 10*i);
            if(resultado != (5/(10*i))){
                return false;
            }
        }
        return true;
    }
}
