package br.ufc.dc.poo.banco.contas;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(String numero){
		super(numero);
	}

	void renderJuros(float taxa){
		super.creditar(super.getSaldo*taxa);
	}
}