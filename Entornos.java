
public class Entornos {

	

	public static void insercion(int[] insercion) {


		// Variables.

				if (array[j + 1] < array[j]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}


		int i = 0;
		int j = 0;
		int aux = 0;

		// Ordenamos el array mediante el método de inserción (crecientemente).

		for (i = 0; i < insercion.length; i++) {
			aux = insercion[i];
			j = i - 1;

			while (j >= 0 && insercion[j] > aux) {
				insercion[j + 1] = insercion[j];
				insercion[j] = aux;
				j--;
			}
		}
	}
}

	}

