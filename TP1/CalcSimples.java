/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcsimples;

import java.util.Scanner;

/**
 *
 * @author 397429
 */
public class CalcSimples {
private float num1;
    private float num2;
    private float result;
    public CalcSimples(){
        this.num1 = this.num2 = 0;
    }
    
    public void setNumbers(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }
    
    public void sum(){
        this.result = (this.num1 + this.num2);
    }
    
    public void sub(){
        this.result = (this.num1 - this.num2);
    }
    
    public void times(){
        this.result = (this.num1 * this.num2);
    }
    
    public void div(){
        this.result = (this.num1 / this.num2);
    }
    
    public void result(){
        System.out.println("O resultado é: " + result);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CalcSimples calc = new CalcSimples();
        float num1, num2;
        char operator;
        num1 = scanner.nextFloat();
        operator = scanner.next().charAt(0);
        num2 = scanner.nextFloat();
        calc.setNumbers(num1,num2);
        if(operator == '+'){
            calc.sum();
        }else if(operator == '-'){
            calc.sub();
        }else if(operator == '*'){
            calc.times();
        }else{
            calc.div();
        }
        calc.result();
        // TODO code application logic here
    }
}