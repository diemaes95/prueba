import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro los primeros dos arrays
		int[] vector1;
		vector1 = new int[12];
		int[] vector2;
		vector2 = new int[12];

		// Doy valores a los arrays
		// array 1
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 12; i++) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector 1");
			vector1[i] = sc.nextInt();
		}
		// array 2
		for (int i = 0; i < 12; i++) {
			System.out.println("Introduzca el valor de la posición " + i + " del vector 2");
			vector2[i] = sc.nextInt();
		}

		// Declaro y doy valores al array 3

		int[] vector3;
		vector3 = new int[24];
		int j = 0;
		for (int i = 0; i < 12; i = i + 3) {
			vector3[j] = vector1[i];
			j++;// 1
			vector3[j] = vector1[i + 1];
			j++;// 2
			vector3[j] = vector1[i + 2];
			j++;// 3
			vector3[j] = vector2[i];
			j++;// 4
			vector3[j] = vector2[i + 1];
			j++;// 5
			vector3[j] = vector2[i + 2];
			j++;// 6
		}
		for (int i = 0; i < 24; i++) {
			System.out.println("Vector 3 posición " + i + " :" + vector3[i]);
		}

	}

}
