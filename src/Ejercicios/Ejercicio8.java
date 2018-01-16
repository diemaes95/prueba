package Ejercicios;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// variables
		int x;
		int y;
		int posicion;
		int[] arrayA;
		arrayA = new int[10];

		// For para pedir números
		for (int i = 0; i < 9; i++) {
			System.out.println("arrayA[" + i + "]:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// pedimos el último número y su posición.
		System.out.println("arrayA[Último Número]:");
		x = entrada.nextInt();
		System.out.println("Posición de éste(0 a 9):");
		posicion = entrada.nextInt();

		// Si la posicion no es la ultima(9), se pondrá en marcha un proceso para mover
		// los números hacia atras.
		if (posicion != 9) {
			for (y = 8; y >= posicion; y--) {
				arrayA[y + 1] = arrayA[y];
			}
		}
		arrayA[posicion] = x;

		// Mostrar
		for (int m = 0; m < 10; m++) {
			System.out.println("arrayA[" + m + "]: " + arrayA[m]);
		}

	}

}
