import java.util.Scanner;

// Crear un array bidimensional de tamaño 5x5 y rellenarlo de la siguiente forma: la
// posición matriz[n][m] debe contener n+m. Después se debe mostrar su contenido.

public class matriz1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		
		final int TOPE = 5;
		int[][] matriz1;
	
		matriz1 = new int [TOPE][TOPE];
		
		// Llenar la matriz
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				matriz1[i][j] = i + j;
			}
		}
		
		// Salida 
		
		System.out.println("La matriz es: ");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
