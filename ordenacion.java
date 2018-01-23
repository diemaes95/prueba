
public class ordenacion {

	public static void burbuja(int[] vector1) {

		// Variables

		int aux = 0;

		// Ordenar vector

		for (int i = 0; i < vector1.length - 1; i++) {

			for (int j = 0; j < vector1.length - i - 1; j++) {

				if (vector1[j + 1] < vector1[j]) {

					aux = vector1[j + 1];
					vector1[j + 1] = vector1[j];
					vector1[j] = aux;
				}
			}
		}
	}
}