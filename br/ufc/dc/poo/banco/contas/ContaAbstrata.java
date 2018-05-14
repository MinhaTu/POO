package br.ufc.dc.poo.banco.contas;

public abstract class ContaAbstrata{
	protected String numero;
	protected double saldo;

	public ContaAbstrata(String numero){
		this.numero = numero;
		this.saldo = 0;
	}

	public void creditar(double valor){
		this.saldo += valor;
	}

	public void debitar(double valor){}

	public String getNumero(){
		return this.numero;
	}
	public double getSaldo(){
		return this.saldo;
	}
}