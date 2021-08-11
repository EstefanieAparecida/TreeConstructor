package com.binary.Tree;

public class Arvore<Tipo extends Comparable> {

	private Elemento<Tipo> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public void adicionar(Tipo valor) {
		Elemento<Tipo> novoElemento = new Elemento<Tipo>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<Tipo> atual = this.raiz;
			while (true) {
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else {// se for maior ou igual
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}

	}

	public Elemento<Tipo> getRaiz() {
		return raiz;
	}

	public void emOrdem(Elemento<Tipo> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());

		}

	}

	public void preOrdem(Elemento<Tipo> atual) {
		if (atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());

		}

	}

	public void posOrdem(Elemento<Tipo> atual) {
		if (atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}

	}
}
