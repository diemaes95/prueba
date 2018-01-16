import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		boolean esCreciente = true;
		boolean esDecreciente = true;

		// Declaro y doy valores al array
		int[] vector;
		vector = new int[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector");
			vector[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(vector[i] + ", ");
		}

		for (int i = 0; i < 9; i++) {

			if (vector[i] > vector[i + 1]) {
				esCreciente = false;

			}
			if (vector[i] < vector[i + 1]) {
				esDecreciente = false;
			}
		}

		if (esCreciente == true) {
			System.out.println("Es creciente");
		} else {
			if (esDecreciente == true) {
				System.out.println("Es decreciente");
			} else {
				System.out.println("Es desordenado");
			}
		}

	}

}
