import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Variables.

		int i, j, k, ultimo, posicion;

		// Declaro y pido valores del array.

		int[] vector;
		vector = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector");
			vector[i] = sc.nextInt();
		}
		// Desplazo el array el número de veces que se indique

		System.out.println("Posiciones a desplazar: ");
		posicion = sc.nextInt();

		for (j = 0; j < posicion; j++) {
			ultimo = vector[9];

			for (i = 8; i >= 0; i--) {
				vector[i + 1] = vector[i];
			}

			vector[0] = ultimo;
		}

		// Se imprime el array con las posiciones cambiadas

		for (k = 0; k < 10; k++) {
			System.out.println("Posición " + k + " del vector: " + vector[k]);
		}

	}
}