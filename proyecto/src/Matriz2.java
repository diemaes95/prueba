import java.util.Scanner;

// Crear y cargar una matriz de tamaño 4x4 y decir si es simétrica o no, es decir si se
// btiene la misma tabla al cambiar las filas por columnas. 

public class Matriz2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones	
		final int TOPE = 4;
		boolean esSimetrica = true;
		
		// Llenar la matriz	
		int matriz1[][] = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
		
		// Mostrar matriz 1
		
		System.out.println("La matriz normal es: ");
		
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Mostrar matriz 2
		
		System.out.println("La matriz traspuesta es: ");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[j][i] + " ");	
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				if (matriz1[i][j] == matriz1[j][i]) {
					
				} else {
					esSimetrica = false;
				}
			}
		}	
		
		if (esSimetrica = false) {
			System.out.println("La matriz no es simetrica ");
		} else {
			System.out.println("La matriz es simetrica ");
		}
		
	}
}
