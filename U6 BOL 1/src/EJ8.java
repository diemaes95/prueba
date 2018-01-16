import java.util.Scanner;

public class EJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro arrays y variables
		int vector[];
		vector = new int[10];
		int vector2[];
		int n, p;

		// Doy 8 valores al vector
		Scanner sc = new Scanner(System.in);
		for (int i = 9; i > 1; i--) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector");
			vector[i] = sc.nextInt();
		}
		System.out.println("Introduzca un número.");
		n = sc.nextInt();// 4
		System.out.println("Introduzca una posición.");
		p = sc.nextInt();// 3

		for (int j = 0; j < p; j++) {
			vector[j] = vector[j + 1];
		}
		vector[p] = n;
		for (int k = 0; k < 10; k++) {
			System.out.println("Posición " + k + " del vector : " + vector[k]);
		}

	}

}
