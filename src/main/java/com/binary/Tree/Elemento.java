package com.binary.Tree;

public class Elemento<Tipo> {
	
	private Tipo valor;
	private Elemento<Tipo> esquerda;
	private Elemento<Tipo> direita;
	
	public Elemento(Tipo novoValor) {
		this.valor = novoValor;
		this.direita = null;
		this.esquerda = null;
	}

	public Elemento<Tipo> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<Tipo> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<Tipo> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<Tipo> direita) {
		this.direita = direita;
	}

	public Tipo getValor() {
		return valor;
	}

	public void setValor(Tipo valor) {
		this.valor = valor;
	}
}
