package git;

public class ordenacion {

	public static void insercion (int[] vector) {

    	int aux;
        for(int i=0;i<10-1;i++) {

        	aux=vector[i];
        	int j=i-1;
        	while(j>=0 && vector[j]>aux){
        		vector[j+1]=vector[j];
        		vector[j]=aux;
        		j--;
        	}
        }
	}

	public static void burbuja(int[] vector) {
		int aux;
		for (int i = 0; i < 10; i++) {
			aux = vector[i];
			int j = i - 1;

			while (j >= 0 && vector[j] < aux) {
				vector[j + 1] = vector[j];
				vector[j] = aux;
				j--;
			}

		}
	}

	public static void seleccion (int[] vector){
		int aux,menor,posicion;
		
        for(int i=0;i<10-2;i++) {
        	menor=vector[i];
        	posicion=i;
        	for(int j=i+1;j<9;j++) {
        		if(vector[j]<menor) {
        			menor=vector[j];
        			posicion=j;
        		}
        	}
        	if(posicion!=i) {
            	aux=vector[i];
            	vector[i]=vector[posicion];
            	vector[posicion]=aux;
            }
        }
		}

}


