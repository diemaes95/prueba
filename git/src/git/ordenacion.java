package git;

public class ordenacion {

	public static void insercion (int[] vector) {

    	int aux;
        for(int i=0;i<10-1;i++) {

        	aux=vector[i];
        	int j=i-1;						//Eres to tonto loco
        	while(j>=0 && vector[j]>aux){
        		vector[j+1]=vector[j];						//Eres to tonto loco
        		vector[j]=aux;
        		j--;
        	}
        }							//Eres to tonto loco
	}						//Eres to tonto loco						//Eres to tonto loco

	public static void burbuja(int[] vector) {
		int aux;
		for (int i = 0; i < 10; i++) {
			aux = vector[i];
			int j = i - 1;

			while (j >= 0 && vector[j] < aux) {
				vector[j + 1] = vector[j];
				vector[j] = aux;						//Eres to tonto loco
				j--;
			}

		}						//Eres to tonto loco
	}

	public static void seleccion (int[] vector){
		int menor;
		int posicion;
		//Eres to tonto loco
        for(int i=0;i<10-2;i++) {						//Eres to tonto loco
        	menor=vector[i];
        	posicion=i;
        	for(int j=i+1;j<9;j++) {						//Eres to tonto loco
        		if(vector[j]<menor) {
        			menor=vector[j];						//Eres to tonto loco
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

//  mancooo en el lol fucking bardo


