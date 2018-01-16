import java.util.Scanner;

// Crear y cargar una matriz de tamaño 10x10, mostrar la suma de cada fila y de cada
// columna

public class Matriz6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Declaraciones
		final int TOPE = 10;
		
		int sumaFila = 0, sumaCol = 0;
		
		int matriz1[][] = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},		
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
		
		// Llenar la matriz
		
		System.out.println("La matriz es: \n");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int fila = 0, col = 0;
		
		// Salida 
		System.out.println("La matriz es: \n");
		
		for (int i = 0; i < TOPE; i++) {
			for (int j = 0; j < TOPE; j++) {
				sumaFila += matriz1[i][j];
			}
			
			System.out.println("La suma de la fila " + fila + " es: " + sumaFila);
			
			fila++;
			sumaCol += i;
			sumaFila = 0;
			
			System.out.println("La suma de la columna " + col + " es: " + sumaCol);
			sumaCol = 0;
			col++;
		}	
	}
}