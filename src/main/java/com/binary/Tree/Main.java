package com.binary.Tree;

public class Main {
	
	
	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(2); 
		arvore.adicionar(1);
		arvore.adicionar(7);
		arvore.adicionar(4);
		System.out.println("Em Ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("Pré Ordem: ");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("Pós Ordem: ");
		arvore.posOrdem(arvore.getRaiz());
	}

}
