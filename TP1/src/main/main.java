package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Insira o n�mero da quest�o: ");
		int n = scanner.nextInt();
		
		if(n == 1) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a > b) {
				System.out.println("O n�mero maior �: " + a);
			}else if(a < b){
				System.out.println("O n�mero maior �: " + b);
			}else {
				System.out.println("Vc digitou os n�meros iguais, imbecil");
			}
		}else if(n == 2) {
			float a = scanner.nextFloat();
			char b = scanner.next().charAt(0);
			float c = scanner.nextFloat();
			float r = 0;
			switch (b) {
				case '+':
					r = a + c;
				break;
				case '-':
					r = a - c;
				break;
				case '*':
					r = a * c;
				break;
				case '/':
					r = a/c;
				break;
				default:
					System.out.println("ERROR 404");
			}
			System.out.println(r);
		}
		
	}

}
