package javaBasico;

import java.util.Scanner;

public class ExemploTipoDados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		short numero=sc.nextShort();
		System.out.println("O numero digitado é: "+numero);
		
		sc.close();
		
	}

}