import java.util.Scanner;

public class EJ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro arrays y variables
		int vector[];
		vector = new int[10];

		// Doy valores al vector
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector");
			vector[i] = sc.nextInt();
		}
		// Proceso
		int tmp = vector[9];

		for (int j = 9; j > 0; j--) {
			vector[j] = vector[j - 1];
		}
		vector[0] = tmp;

		for (int k = 0; k < 10; k++) {
			System.out.println("Posición " + k + " del vector : " + vector[k]);

		}
	}

}
