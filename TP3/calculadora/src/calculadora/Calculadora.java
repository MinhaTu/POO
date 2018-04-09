/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author MinhaTu
 */
public class Calculadora {
    private float result;
    
    public Calculadora(){
        
    }
    
    public float sum(float num1, float num2){
        return 0;
    }
    
    public float minus(float num1, float num2){
        return 0;
    }
    public float times(float num1, float num2){
        return 0;
    }
    public float divides(float num1, float num2){
        return 0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CalcTest teste = new CalcTest(20);
        Calculadora calc = new Calculadora();
        System.out.println(calc.sum(10, 10));
        System.out.println("soma: " + teste.testarSum());
        System.out.println("Subtração: " + teste.testarMinus());
        System.out.println("Multiplicação: " + teste.testarTimes());
        System.out.println("Divisão: " + teste.testarDivides());
        
    }
    
}
