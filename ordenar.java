public class ordenar {

public static void crec (int[] vector){
	
		    int i, j, menor, pos, tmp;
	    
	    
		
		for(int contador=0;contador<10;contador++) {
			System.out.println("Introduce numero ");
			vector1[contador]=entrada.nextInt();
		}
		for(int contador=0;contador<10;contador++) {
			System.out.println("Vector desordenado: ");
			System.out.println(vector1[contador]);
		}
		
	    
          for (i = 0; i < vector1.length - 1; i++) {
                menor = vector1[i];
                pos = i; 
                for (j = i + 1; j < vector1.length; j++){ 
                      if (vector1[j] < menor) { 
                          menor = vector1[j]; 
                          pos = j;
                      }
                }
                if (pos != i){ 
                    tmp = vector1[i];
                    vector1[i] = vector1[pos];
                    vector1[pos] = tmp;
                }
          }
	
	
}
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