package com.binary.Tree;

public class �rvore_Bin�ria {
	N� root;

	public void traverseTree(N� n�) {
		if (n� != null) {
			traverseTree(n�.esquerdo);
			System.out.print(" " + n�.key);
			traverseTree(n�.direito);
		}
	}

}
