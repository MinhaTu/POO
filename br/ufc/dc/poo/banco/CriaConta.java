package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.Conta;
public class CriaConta{
	public static void main(String[] args){
		Conta c = new Conta("397429");
		c.creditar(100);
		c.debitar(50);
		System.out.println(c.getSaldo());
	}
}