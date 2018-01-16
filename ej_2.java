
/* Leer 5 números y mostrarlos en orden inverso al introducido. */

import java.util.*;

public class ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaramos el array.

		int[] vector;
		vector = new int[5];
		
		// Damos valores al array.
		
		vector[0] = 5;
		vector[1] = 2;
		vector[2] = 10;
		vector[3] = -4;
		vector[4] = 7;

		// Imprimimos el array.

		System.out.println("vector:");
		for (int i = 4; i >= 0; i--) {
			System.out.println(vector[i]);
		}

	}

}
