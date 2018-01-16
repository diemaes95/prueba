import java.util.Scanner;

// Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma. 

public class Matriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// Declaraciones
		final int TOPE = 3;
		boolean esSimetrica = true;

		// Llenar la matriz
		int matriz1[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int matriz2[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };


		// Mostrar matriz 1

		System.out.println("La matriz 1 es: ");

		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		

		// Mostrar matriz 2

		System.out.println("La matriz 2 es: ");

		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		

		// Mostrar matriz suma 

		System.out.println("La matriz suma es: ");

		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
}