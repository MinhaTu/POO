package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.Conta;
import br.ufc.dc.poo.banco.contas.ContaPoupanca;
import java.util.Vector;

public class BancoArray {
    private Vector<Conta> contas;
    private double taxa;
    //private Conta[] contas;
    private int indice = 0;
    public BancoArray(){
        contas = new Vector<Conta>();
        taxa = 0.01;
    }
    public void cadastrar(Conta conta){
        if(procurar(conta.getNumero()) == null){
            contas.add(conta);
            indice++;
        }else{
            System.out.println("Nao foi possivel cadastrar");
        }

    }
    private Conta procurar(String numero){
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
        Conta conta;  //passagem por refência 
        conta = procurar(numero);
        if (conta != null) {
            conta.debitar(valor);
        } else {
            System.out.println("Conta Inexistente!");
        }
    }
    
    public void creditar(String numero, double valor){
        Conta conta;
        conta = procurar(numero);
        if(conta != null){
            conta.creditar(valor);
        }else{
            System.out.println("Conta Inexistente!");
        }
    }
    
    public void transferir(String numero1, String numero2, double valor){
        Conta conta1;
        Conta conta2;
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
        Conta  conta = procurar(numero);
        if(conta != null && conta instanceof ContaPoupanca){
            ((ContaPoupanca) conta).renderJuros(this.taxa);
        }
    }
}