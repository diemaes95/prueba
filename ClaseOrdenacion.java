import java.util.Scanner;

public class ClaseOrdenacion {
	
	
}
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
	
	//Insercción
		public static void inserccion (int[] array) {
			//Declaración del array
			int numero;
			int aux;
			int j;
			//Proceso
			for (int i = 0; i < 10; i++) {
				aux = this.array[i];
				j = i - 1;
				while (j >= 0 && this.array[j] > aux) {
					this.array[j + 1] = this.array[j];
					this.array[j] = aux;
					j--;
				}
			}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaración del array
		int[] array;
		array = new int [10];
		//Valores del array
		for(int i = 0; i < 10; i++){
			System.out.println("Introduce número para el array");
			numero = entrada.nextInt();
			array[i] = numero;
		}
		System.out.println("Array Original:");
		for(int i = 0; i < 10; i++){
			System.out.println(array[i]);			
		}
		ClaseOrdenacion.inserccion(array);
		
		//Salida
		System.out.println("Array Ordenado:");
		for(int i = 0; i < 10; i++){
			System.out.println(array[i]);
		}
	}

}
