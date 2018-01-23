public class ordenar {

	public static void Insercion(int[] vector) {

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