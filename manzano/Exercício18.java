package manzano;
import java.util.*;

public class Exerc�cio18 {
	public static void main(String args[]) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		if(valor < 0) {
			valor *= -1;
		}
		
		System.out.println("O modulo �: " + valor);
		
		sc.close();
	}

}