
public class ordenacion {
	
	public static void Insercion(int[] vector) {

<<<<<<< HEAD
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
=======
		int j;
		int aux;
		for (int i = 0; i <= vector.length - 1; i++) {
			aux = vector[i];
			j = i - 1;
			while (j >= 0 && vector[j] > aux) {
				vector[j + 1] = vector[j];
				vector[j] = aux;
				j--;
			}
		}
	}
	
}
>>>>>>> dc986d20e1f787bac8605bf486ddb91bbacbb4d8
