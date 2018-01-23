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

}
