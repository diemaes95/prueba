package Ejercicios;

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// variables
		int x;
		int m = 5;
		int n = 0;
		int[] arrayA;
		int[] arrayB;
		arrayA = new int[10];
		arrayB = new int[10];

		// For para pedir números
		for (int i = 0; i < 10; i++) {
			System.out.println("arrayA[" + i + "]:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// Pasamos los números pares primero y luego los impares.
		for (int y = 0; y < 10; y++) {
			if (arrayA[y] % 2 == 0) {
				arrayB[n] = arrayA[y];
				n += 1;
			}
		}
		for (int s = 0; s < 10; s++) {
			if (arrayA[s] % 2 != 0) {
				arrayB[n] = arrayA[s];
				n += 1;
			}
		}

		// mostrar
		for (int z = 0; z < 10; z++) {
			System.out.println("arrayA[" + z + "]: " + arrayB[z]);
		}
	}

}
