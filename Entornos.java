
public class Entornos {

	public static void Burbuja(int[] array) {

		for (int i = 0; i < 10 - 1; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {

				if (array[j + 1] < array[j]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
	}
