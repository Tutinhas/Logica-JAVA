package javaBasico;

import java.util.Scanner;

public class QuartoProgramaJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");	
		int numero=sc.nextInt();
		
		System.out.println("Digite um valor:");
		int numero2 = sc.nextInt();
		
		int soma=numero+numero2;
		
		System.out.println("A soma dos valores �:"+soma);
		
		sc.close();
	}
}