
public class ordenacion {

<<<<<<< HEAD

	public static void seleccion(int[] array) {
		//Declaración de variables
		int posicion;
		int aux;
		
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
			}
		}
>>>>>>> 5df2fad488c58930b0aa868c1257af36a4d15316
	}
	

	
	
}
