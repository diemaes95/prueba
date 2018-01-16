import java.util.Scanner;

// Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla. 

public class Matriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// Declaraciones
		final int TOPE = 3;
		boolean esSimetrica = true;

		// Llenar la matriz
		int matriz1[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int matriz2[][];
		
		matriz2 = new int [TOPE][TOPE];
		
		// Mostrar matriz normal

		System.out.println("La matriz normal es: ");

		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		

		// Mostrar matriz traspuesta

		System.out.println("La matriz traspuesta es: ");

		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				matriz2[i][j] = matriz1[j][i];
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
}