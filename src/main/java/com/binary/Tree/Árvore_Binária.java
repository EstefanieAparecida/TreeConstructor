package com.binary.Tree;

public class Árvore_Binária {
	Nó root;

	public void traverseTree(Nó nó) {
		if (nó != null) {
			traverseTree(nó.esquerdo);
			System.out.print(" " + nó.key);
			traverseTree(nó.direito);
		}
	}

}
