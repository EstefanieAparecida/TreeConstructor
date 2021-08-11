package com.binary.Tree;

public class Objeto_Arvore {

	public static void main(String[] args) {

		Árvore_Binária tree = new Árvore_Binária();

		tree.root = new Nó(1);
		tree.root.direito = new Nó(2);
		tree.root.esquerdo = new Nó(4);
		tree.root.direito.direito = new Nó(7);

		System.out.print(" Arvore binaria é : ");
		tree.traverseTree(tree.root);
	}
}
