import java.util.Scanner;

// Leer 5 elementos enteros que se introducirán ordenados de forma creciente.
// Éstos los guardaremos en un array de tamaño 10. Leer un número N, e
// insertarlo en el lugar adecuado para que el array continúe ordenado. 


public class vec11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1, vector2;
		int elemento;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < 5; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			vector2[i] = vector1[i];
		}
		
		System.out.println("Introduzca un nuevo elemento: ");
		elemento = entrada.nextInt();
		

		if (elemento <= vector1[0]) {  // El elemento es el primero
			vector2[0] = elemento;
			for (int i = 1; i < 10; i++) {
				vector2[i] = vector1[i - 1];
			}
		} else {

			if (elemento >= vector1[4]) {  // El elemento es el ultimo
				for (int i = 1; i < 10; i++) {
					vector2[i] = vector1[i];
				}
				vector2[5] = elemento;
			} else {
				
				vector2[0] = vector1[0];
				
				for (int i = 1; i < 9; i++) {  // El elemento esta en medio
					if (elemento >= vector1[i]) {
						vector2[i] = vector1[i];
					} else {
						if ((elemento >= vector1[i-1]) && (elemento <= vector1[i])){
							vector2[i] = elemento;
						
						} else {
							vector2[i] = vector1[i-1];
						}
					}
						
				}
				
				vector2[5] = vector1[4];
			}	
		}
		
		
		// Imprime el vector	
		System.out.println("El array ordenado es: ");
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(vector2[i]);
			
		}
	}
}