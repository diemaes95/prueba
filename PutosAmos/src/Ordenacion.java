
public class Ordenacion {
	
			// variables//

			private int numero, i, j, temp, aux;

			// vector//

			private int[] vector;
			vector = new private int[10];
	
	public static void insercionAscendente (int [] vector) {
		for (i = 0; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while (j >= 0 && vector[j] > temp) {
				vector[j + 1] = vector[j];
				vector[j] = temp;
				j--;
			}
		}
	}
	
	public static void insercionDescendente (int [] vector) {
		for (i = 0; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while (j >= 0 && vector[j] < temp) {
				vector[j + 1] = vector[j];
				vector[j] = temp;
				j--;
			}
		}
	}
	
	public static void burbuja(int [] vector) { // Ascendente
		
		for (int i = 0; i < vector.length - 1; i++) // Ordenación del vector

			for (int j = 0; j < vector.length - 1 - i; j++) {

				if (vector[j] > vector[j + 1]) { // Si hay desorden entre dos consecutivos, estos se cambian

					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}

			}
	}

	
}
