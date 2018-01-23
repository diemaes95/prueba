
public class ordenacion {

	// Metodo burbuja ascendente
	public static void burbuja(int[] elementos) {
		int aux, i, j;
		int[] elementos = new int[10];

		for (i = 0; i <= 10; i++) {
			for (j = 0; j <= 10 - i - 2; j++) {
				if (elementos[j + 1] < elementos[j]) {
					aux = elementos[j + 1];
					elementos[j + 1] = elementos[j];
					elementos[j] = aux;
				}
			}
		}
	}

	// Metodo inserccion Creciente
	public void inserccion(int[] vector) {

		// Declaraciond de variables
		int vuelta, tmp = 0;

		for (int cont = 0; cont <= vector.length - 1; cont++) {
			tmp = vector[cont];
			vuelta = cont - 1;

			while (vuelta >= 0 && vector[vuelta] > tmp) {
				vector[vuelta + 1] = vector[vuelta];
				vector[vuelta] = tmp;
				vuelta--;
			}
		}
	}

}
