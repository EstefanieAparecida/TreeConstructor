package com.binary.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeConstructo {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Iniciar Arvore Binaria?(sim ou nao) ");
		String resposta = entrada.next();
		while("sim".equals(resposta)) {
			System.out.print("Digite a sequencia de i1: ");
			int resposta1 = entrada.nextInt();
			System.out.println("Deseja continuar? (sim ou nao) ");
			resposta = entrada.next();

		}
		
	}

	
}
