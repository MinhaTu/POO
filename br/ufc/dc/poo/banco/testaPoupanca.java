package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.*;
public class testaPoupanca{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BancoArray b = new BancoArray();
		Conta conta1;
		ContaPoupanca conta2;
		System.out.println("Informa a 1 conta: ");
		conta1 = new Conta(scanner.next());
		System.out.println("Informa a 2 conta: ");
		conta2 = new ContaPoupanca(scanner.next());
		b.cadastrar(conta1);
		b.cadastrar(conta2);
		b.creditar(conta1.getNumero(), 500);
	    b.creditar(conta2.getNumero(), 200);
		System.out.println("Saldo da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
		b.renderJuros(conta2.getNumero());
		System.out.println("Saldo da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
	}
}