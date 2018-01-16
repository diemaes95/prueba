import java.util.Scanner;

// Hacer lo mismo que el ejercicio anterior, pero con una matriz 9x9x9. Creamos un
// cubo con las caras puestas a 1 y el interior a 0. 

public class Matriz9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		
		final int TOPE = 9;
		int[][][] matriz1;
	
		matriz1 = new int [TOPE][TOPE][TOPE];
		
		
		
		// Llenar la matriz
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				for (int k = 0; k < TOPE; k++) {
					
					if ((i == 0) || (i == 8)) {
						matriz1[i][j][k] = 1;
					} else {
						if ((j == 0) || (j == 8)) {
							matriz1[i][j][k] = 1;
						} else {
							if ((k == 0) || (k == 8)) {
								matriz1[i][j][k] = 1;
							} else {
								matriz1[i][j][k] = 0;
							}
						}
					}
				}
			}
		}
		
		// Salida 
		System.out.println("La matriz es: \n");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				for (int k = 0; k < TOPE; k++) {
					System.out.print(matriz1[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}