package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Digite um valor de 0 a 10: ");
			valor = scanner.nextInt();
		} while (valor < 0 || valor > 10);
		scanner.close();
		FatController fat = new FatController();
		long fatorial = fat.fatorial(valor);
		System.out.println("Fatorial de " + valor + " é igual a: " + fatorial);
	}
}
