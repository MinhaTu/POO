
package br.ufc.dc.poo.banco;

import br.ufc.dc.poo.banco.contas.*;
import java.util.Scanner;
public class testaBanco{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BancoArray b = new BancoArray();
		Conta conta1, conta2;
		System.out.println("Informa a 1 conta: ");
		conta1 = new Conta(scanner.next());
		System.out.println("Informa a 2 conta: ");
		conta2 = new Conta(scanner.next());
		System.out.println("Informe a 3 conta: ");
		Conta conta3 = new ContaEspecial(scanner.next());
		b.cadastrar(conta1);
		b.cadastrar(conta2);
		b.cadastrar(conta3);
		b.creditar(conta1.getNumero(), 500);
	    b.creditar(conta2.getNumero(), 200);
	    b.creditar(conta3.getNumero(), 500);
	    b.renderBonus(conta2.getNumero());
		System.out.println("Saldo da conta 1 " + conta1.getNumero() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta 2" + conta2.getNumero() + ": " + conta2.getSaldo());
		b.transferir(conta1.getNumero(),conta2.getNumero(), 500);
		System.out.println("Saldo da conta1 apos tranferencia " + conta1.getNumero() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta2 apos tranferencia " + conta2.getNumero() + ": " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 após renderBonus: " + conta3.getSaldo());
	}
}