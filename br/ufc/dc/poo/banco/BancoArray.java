package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.*;
import java.util.Vector;

public class BancoArray implements IBanco{
    private Vector<ContaAbstrata> contas;
    private double taxa;
    //private Conta[] contas;
    private int indice = 0;
    public BancoArray(){
        contas = new Vector<ContaAbstrata>();
        taxa = 0.01;
    }

    public double saldoTotal(){
        double saldoTotal = 0;
        ContaAbstrata conta;
        for (int i = 0;i < contas.size();i++){
            conta = contas.get(i);
            saldoTotal += conta.getSaldo();    
        }
        return saldoTotal;
    }

    public int numeroContas(){
        return contas.size();
    }   

    public void cadastrar(ContaAbstrata conta){
        if(procurar(conta.getNumero()) == null){
            contas.add(conta);
            indice++;
        }else{
            System.out.println("Nao foi possivel cadastrar");
        }
    }
    public ContaAbstrata procurar(String numero){
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < indice)) {
            if(contas.get(i).getNumero().equals(numero)){
                achou = true;
            } else {
                i++;
            }

        }
        if (achou == true) {
            return contas.get(i);
        } else {
            return null;
        }
    }
    
    public void debitar(String numero, double valor) {
        ContaAbstrata conta;  //passagem por refência 
        conta = procurar(numero);
        if (conta != null) {
            conta.debitar(valor);
        } else {
            System.out.println("Conta Inexistente!");
        }
    }
    
    public void creditar(String numero, double valor){
        ContaAbstrata conta;
        conta = procurar(numero);
        if(conta != null){
            conta.creditar(valor);
        }else{
            System.out.println("Conta Inexistente!");
        }
    }

    public double saldo(String numero){
        ContaAbstrata conta;
        conta = procurar(numero);
        if(conta != null){
            return conta.getSaldo();
        }else{
            System.out.println("Conta Inexistente!");
        }
    }    
    public void transferir(String numero1, String numero2, double valor){
        ContaAbstrata conta1;
        ContaAbstrata conta2;
        conta1 = procurar(numero1);
        conta2 = procurar(numero2);
        if(conta1 != null && conta2 != null){
            conta1.debitar(valor);
            conta2.creditar(valor);
        }else{
            System.out.println("Conta Inexistente!");
        }
    }

    public void renderJuros(String numero){
        ContaAbstrata  conta = procurar(numero);
        if(conta != null && conta instanceof ContaPoupanca){
            ((ContaPoupanca) conta).renderJuros(this.taxa);
        }
    }

    public void renderBonus(String numero){
        ContaAbstrata conta = procurar(numero);
        if(conta != null && conta instanceof ContaEspecial){
            ((ContaEspecial) conta).renderBonus();
        }else{
            System.out.println("Conta informada não é especial");
        }
    }
}