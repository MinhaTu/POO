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
public class Banco {
    private Conta[] contas;
    private int indice = 0;
    public Banco(){
        contas = new Conta[100];
    }
    public void cadastrar(Conta conta){
        contas[indice] = conta;
        indice++;
    }
    private Conta procurar(String numero){
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < indice)) {
            if (contas[i].numero().equals(numero)) {
                achou = true;
            } else {
                i++;
            }
        }
        if (achou == true) {
            return contas[i];
        } else {
            return null;
        }
    }
    
    public void debitar(String numero, double valor) {
        Conta conta;
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
}
