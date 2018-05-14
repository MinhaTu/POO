package br.ufc.dc.poo.banco.contas;

public class ContaImposto extends ContaAbstrata{

	public ContaImposto(String numero){
		super(numero);
	}

	public debitar(double valor){
		saldo -= (valor + (valor*0.001));
	}
}