
public class ordenacion {

	
<<<<<<< HEAD
	public static void burbujaDesc(int[] array) {
	for (int i = 0; i < array.length - 1; i++) {
		for (int j = 0; j <= array.length - i - 2; j++)
			if (array[j + 1] > array[j]) {
				tmp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = tmp;
=======
	
	// Metodo inserccion Creciente
	public void inserccion(int [] vector) {
	
		// Declaraciond de variables
		int vuelta, tmp = 0;
		
		for (int cont = 0; cont <= vector.length - 1; cont++) {
			tmp = vector[cont];
			vuelta = cont - 1;
	
			while (vuelta >= 0 && vector[vuelta] > tmp) {
				vector[vuelta + 1] = vector[vuelta];
				vector[vuelta] = tmp;
				vuelta--;
>>>>>>> 5df2fad488c58930b0aa868c1257af36a4d15316
			}
		}
	}

<<<<<<< HEAD

=======
	
	
>>>>>>> 5df2fad488c58930b0aa868c1257af36a4d15316
}
