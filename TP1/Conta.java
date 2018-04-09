/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancobb;

/**
 *
 * @author 397429
 */
public class Conta {
    private String numero;
    private double saldo;
    public Conta (String numero) {
        this.numero = numero;
        saldo = 0;
    }
    public void creditar (double valor){
        saldo = saldo + valor;
    }
    public void debitar (double valor){
        saldo = saldo - valor;
    }
    public String numero() {
        return numero;
    }
    public double saldo() {
        return saldo;
    }   
}

