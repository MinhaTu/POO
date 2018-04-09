/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcsimples;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author 397429
 */
public class Calculadora {
    public Calculadora(){
    }
    
    public double adicionar(double operandoA, double operandoB){
        return (operandoA + operandoB);
    }
    
    public double subtrair(double operandoA, double operandoB){
        return (operandoA - operandoB);
    }
    
    public double multiplicar(double operandoA, double operandoB){
        return (operandoA * operandoB);
    }
    
    public double dividir(double operandoA, double operandoB){
        return (operandoA / operandoB);
    }
    public double potencia(double base, int expoente){
        return (Math.pow(base,expoente));
    }
    public double raiz(double radicando){
        return Math.sqrt(radicando);
    }
    public double seno(double angulo){
        return Math.sin(angulo);
    }
    public double coseno(double angulo){
        return Math.cos(angulo);
    }
    public double tangente(double angulo){
        return Math.tan(angulo);
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO code application logic here
    }
}
