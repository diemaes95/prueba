import java.util.Scanner;

// Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
// los de los bordes que deben ser 1. Mostrarla. 

public class Matriz8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		
		final int TOPE1 = 8;
		final int TOPE2 = 6;
		int[][] matriz1;
	
		matriz1 = new int [TOPE1][TOPE2];
		
		// Llenar la matriz
		
		for (int i = 0; i < TOPE1; i++) {
			for (int j = 0; j < TOPE2; j++) {
				if ((i == 0) || (i == 7)) {
					matriz1[i][j] = 1;
				} else {
					if ((j == 0) || (j == 5)) {
						matriz1[i][j] = 1;
					} else {
						matriz1[i][j] = 0;
					}
				}
			}
		}
		
		// Salida 
		
		System.out.println("La matriz es: \n");
		
		for (int i = 0; i < TOPE1; i++) {
			for (int j = 0; j < TOPE2; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
