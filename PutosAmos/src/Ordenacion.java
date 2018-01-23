
public class Ordenacion {

	private int aux;

	// vector//

	private int[] vector;
	vector = new private int[10];
	
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

	
}
