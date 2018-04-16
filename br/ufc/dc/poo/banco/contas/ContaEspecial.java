package br.ufc.dc.poo.banco.contas;


public class ContaEspecial extends Conta{
	private double bonus;
	public ContaEspecial(String numero){
		super(numero);
		bonus = 0;
	}

	public void renderBonus(){
		super.creditar(bonus);
		bonus = 0;
	}

	public void creditar(double valor){
		bonus = bonus + (valor*0.01);
		super.creditar(valor);
	}
}