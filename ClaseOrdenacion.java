import java.util.Scanner;

public class ClaseOrdenacion {
	
	public static void seleccion (int [] array) {
		
		int numero, menor, posicion=0, aux;
		
		for (int i = 0; i < 9 ; i ++) {
        	
        	menor = array [i];
        	posicion = i;
        	for (int j = i + 1; j < 10; j++ ) {
        		
        		if (array[j] < menor) {
        			menor=array[j];
        			posicion = j;
        		}
        		
        	}
        	
        	if (posicion != i) {
        		aux = array [i];
        		array [i] = array[posicion];
        		array [posicion] = aux;
        	}
        	
        }
		
		
	}
	
	

	public static void main(String[] args) {
		
		int numero;
		
		int [] array;
		array = new int [10];
		
	
	//Entradas
		
		Scanner teclado=new Scanner(System.in);
        
        
        for (int i = 0; i < 10; i++) {
        		System.out.println("Introduce un numero");
                
                numero = teclado.nextInt();
                
                array[i]=numero;
                
        	
        }
        
        for (int i = 0; i < 10; i++) {
    		System.out.println("Los valores del array original eran: " + array[i]);

        }
		
		ClaseOrdenacion.seleccion(array);
		
		for (int i = 0; i < 10; i++) {
    		System.out.println("Los valores del array ordenados son: " + array[i]);

        }

	}

}
