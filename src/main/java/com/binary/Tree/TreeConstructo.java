package com.binary.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeConstructo {

	public static void main(String[] args) {

		ArrayList<Integer> listaX = new ArrayList<Integer>();
		ArrayList<Integer> listaY = new ArrayList<Integer>();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Iniciar Arvore Binaria?(sim ou nao) ");
		String resposta = entrada.next();
		while ("sim".equals(resposta)) {
			System.out.print("Digite o filho I1: ");
			int resposta1 = entrada.nextInt();
			listaX.add(resposta1);
			System.out.print("Digite o pai I2: ");
			int resposta2 = entrada.nextInt();
			listaY.add(resposta2);
			System.out.println("Deseja continuar? (sim ou nao) ");
			resposta = entrada.next();

		}
		int contador = 0;
		int contador2 = 0;
		for (int x = 0; x < listaX.size(); x++) {

			for (int y = x + 1; y < listaX.size(); y++) {

				if (listaX.get(x) == listaX.get(y)) {
					contador++;
				}
				if (listaY.get(x) == listaY.get(y)) {
					contador2++;
				}
			}
		}
		
		if (contador > 1 || contador2 > 1) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}

}
