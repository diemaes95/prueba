
/* Leer 5 números y mostrarlos en el mismo orden introducido. */

import java.util.*;

public class ej_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaramos el array.

		int[] vector = { 5, 2, 10, -4, 7 };

		// Imprimimos el array.

		System.out.println("vector:");
		for (int i = 0; i < 5; i++) {
			System.out.println(vector[i]);
		}

	}

}
