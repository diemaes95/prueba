
public class Ordenacion {
	
			// variables//

			private int numero, i, j, temp;

			// vector//

			private int[] vector;
			vector = new private int[10];
	
	public static void InsercionAscendente (vector int[]) {
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
	
	public static void InsercionDescendente (vector int[]) {
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

	
}
