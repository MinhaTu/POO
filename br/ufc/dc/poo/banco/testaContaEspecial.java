package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.ContaEspecial;
public class testaContaEspecial{
	public static void main(String[] args) {
		ContaEspecial conta = new ContaEspecial("397429");
		conta.creditar(500);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.renderBonus();
		System.out.println("Saldo após renderJuros: " + conta.getSaldo());
	}
}