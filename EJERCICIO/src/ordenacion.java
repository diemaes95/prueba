
public class ordenacion {

	
	
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
	}

	
	
}
