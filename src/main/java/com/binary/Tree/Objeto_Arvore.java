package com.binary.Tree;

public class Objeto_Arvore {

	public static void main(String[] args) {

		�rvore_Bin�ria tree = new �rvore_Bin�ria();

		tree.root = new N�(1);
		tree.root.direito = new N�(2);
		tree.root.esquerdo = new N�(4);
		tree.root.direito.direito = new N�(7);

		System.out.print(" Arvore binaria � : ");
		tree.traverseTree(tree.root);
	}
}
