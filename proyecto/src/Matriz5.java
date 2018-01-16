import java.util.Scanner;

// Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
// diagonal principal sean 1 y el resto 0. 

public class Matriz5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		
		final int TOPE = 7;
		int[][] matriz1;
	
		matriz1 = new int [TOPE][TOPE];
		
		// Llenar la matriz
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				if (i == j) {
					matriz1[i][j] = 1;
				} else {
					matriz1[i][j] = 0;
				}
			}
		}
		
		// Salida 
		
		System.out.println("La matriz es: \n");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
	}
}