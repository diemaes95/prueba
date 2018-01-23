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


		
		
		public static void burbuja (int[] vector) {
			int aux;
			for (int i = 0; i < 10; i++) {
				aux = vector[i];
				int j = i - 1;

				while (j >= 0 && vector[j] < aux) {
					vector[j+1] = vector[j];
					vector[j] = aux;
					j--;
				}
			}
			
		
>>>>>>> 3e50dccf8dffef02a2f9b27c44bca7169ce148be
		
	}

}
