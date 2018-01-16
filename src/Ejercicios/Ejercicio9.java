package Ejercicios;

import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// variables
		int x;
		int tmp;
		int[] arrayA;
		arrayA = new int[10];

		// For para pedir números
		for (int i = 0; i < 10; i++) {
			System.out.println("arrayA[" + i + "]:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// Cambiamos las posiciones
		tmp = arrayA[9];
		for (int y = 8; y >= 0; y--) {
			arrayA[y + 1] = arrayA[y];
		}
		arrayA[0] = tmp;

		// Mostrar
		for (int m = 0; m < 10; m++) {
			System.out.println("arrayA[" + m + "]: " + arrayA[m]);
		}
	}

}
