import java.util.Scanner;

// Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la
// segunda. 

public class Matriz7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		
		final int TOPE1 = 9;
		final int TOPE2 = 5;
		int[][] matriz1, matriz2;
	
		matriz1 = new int [TOPE1][TOPE2];
		matriz2 = new int [TOPE2][TOPE1];
		
		// Llenar la matriz
		
		for (int i = 0; i < TOPE1; i++) {
			for (int j = 0; j < TOPE2; j++) {
				matriz1[i][j] = i + j;
			}
		}
		
		// Matriz normal
		
		System.out.println("La matriz normal es: \n");
		
		for (int i = 0; i < TOPE1; i++) {
			for (int j = 0; j < TOPE2; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		// Matriz traspuesta
		
		System.out.println("\nLa matriz traspuesta es: \n");
		
		for (int i = 0; i < TOPE2; i++) {
			for (int j = 0; j < TOPE1; j++) {
				matriz2[i][j] = matriz1[j][i];
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
