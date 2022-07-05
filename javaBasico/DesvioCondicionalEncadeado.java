package javaBasico;

import java.util.Scanner;

public class DesvioCondicionalEncadeado {
// metodo => ação dentro da classe
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int numero = sc.nextInt();
		
		if (numero>10) {
			System.out.println("É maior que 10");
		} else {
			System.out.println("É menor que 10");
			
			sc.close();
		}
	}
}
              