import java.util.Scanner;

public class Entornos {

	public static void insercion(int[] array) {

		// Variables.

		int i = 0;
		int j = 0;
		int aux = 0;

		// Ordenamos el array mediante el método de inserción (crecientemente).

		for (i = 0; i < array.length; i++) {
			aux = array[i];
			j = i - 1;

			while (j >= 0 && array[j] > aux) {
				array[j + 1] = array[j];
				array[j] = aux;
				j--;
			}
		}
	}
}
