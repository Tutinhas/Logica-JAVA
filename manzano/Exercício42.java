package manzano;

/* Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de 
1 at� 500 */

public class Exerc�cio42 {

	public static void main(String[] args) {
		int soma = 0;
		int i = 0;
		
		do {
			soma += i;
			i+=2;
			
		}while(i <= 500);
		
		System.out.println("A soma dos valores pares existentes de 1 a 500 �: " + soma);

	}

}