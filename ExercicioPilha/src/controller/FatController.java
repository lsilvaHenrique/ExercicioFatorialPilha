package controller;

import java.util.Stack;

public class FatController {
	
	public long fatorial(int valor) {
		Stack<Integer> pilha = new Stack<Integer>();
		long fatorial = 1;
		pilha.push(valor);
		while (!pilha.isEmpty()) {
			int n = pilha.pop();
			fatorial *= n;
			if (n > 1) {
				pilha.push(n - 1);		
			}
		}
		return fatorial;
	}
	
}
