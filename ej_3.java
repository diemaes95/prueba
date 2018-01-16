
/* Leer 5 números por teclado y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros. */

import java.util.*;

public class ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Variables.

		int x;
		int i = 0;
		int positivo = 0;
		int negativo = 0;
		int ceros = 0;
		double mediaPos = 0;
		double mediaNeg = 0;
		int sumaPos = 0;
		int sumaNeg = 0;

		// Declaramos el array.

		int[] vector;
		vector = new int[5];

		// Damos valores al array.

		for (i = 0; i < 5; i++) {
			System.out.println("Introduzca 5 números.");
			x = entrada.nextInt();

			vector[i] = x;

			if (vector[i] == 0) { // Contar el número de ceros.
				ceros++;
			} else if (vector[i] > 0) { // Contar el número de positivos.
				positivo++;
				sumaPos += vector[i];
			} else if (vector[i] < 0) { // Contar el número de negativos.
				negativo++;
				sumaNeg += vector[i];
			}

		}

		// Media de los positivos.

		if (positivo != 0) {
			mediaPos = (sumaPos) / positivo;
			System.out.println("Media números positivos = " + mediaPos);
		} else {
			System.out.println("No hay positivos.");
		}

		// Media de los negativos.

		if (negativo != 0) {
			mediaNeg = (sumaNeg) / negativo;
			System.out.println("Media números negativos = " + mediaNeg);
		} else {
			System.out.println("No hay negativos.");
		}

		System.out.println("Número de ceros = " + ceros);

	}

}
