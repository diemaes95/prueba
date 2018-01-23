
public class ordenacion {

<<<<<<< HEAD
<<<<<<< HEAD
	
<<<<<<< HEAD
	public static void burbujaDesc(int[] array) {
	for (int i = 0; i < array.length - 1; i++) {
		for (int j = 0; j <= array.length - i - 2; j++)
			if (array[j + 1] > array[j]) {
				tmp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = tmp;
=======
	
=======
=======
	public static void seleccion(int[] array) {
		int aux, posicion;
		
		//Método de la selección orden creciente
		for(int i=0; i<=array.length-2;i++) {
			int menor= array[i];
			posicion=i;
			for(int j=i+1;j<=array.length-1;j++) {
				if(array[j]<menor) {
					menor=array[j];
					posicion=j;
				}
			}
			if(posicion!=i) {
				aux=array[i];
				array[i]=array[posicion];
				array[posicion]=aux;
			}
		}//for
	}
	
	
>>>>>>> 407e27d4f4180160c5d59a8e19b0cc813c695c9a
	// Metodo burbuja ascendente
	public static void burbuja(int[] elementos) {
		int aux, i, j;
		

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

>>>>>>> ed1242d0df8d90b491ef4c8ea970637f71b7a9d9
	// Metodo inserccion Creciente
	public void static inserccion(int[] vector) {

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
<<<<<<< HEAD

=======
	
	
>>>>>>> 5df2fad488c58930b0aa868c1257af36a4d15316
=======
>>>>>>> ed1242d0df8d90b491ef4c8ea970637f71b7a9d9
}
