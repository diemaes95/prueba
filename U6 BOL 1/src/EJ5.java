import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// Declaro los dos primeros arrays
		int[] vector1;
		vector1 = new int[10];
		int[] vector2;
		vector2 = new int[10];
		System.out.println("Introduzca los 10 números del array 1.");
		vector1[0] = sc.nextInt();
		vector1[1] = sc.nextInt();
		vector1[2] = sc.nextInt();
		vector1[3] = sc.nextInt();
		vector1[4] = sc.nextInt();
		vector1[5] = sc.nextInt();
		vector1[6] = sc.nextInt();
		vector1[7] = sc.nextInt();
		vector1[8] = sc.nextInt();
		vector1[9] = sc.nextInt();

		System.out.println("Introduzca los 10 números del array 2.");
		vector2[0] = sc.nextInt();
		vector2[1] = sc.nextInt();
		vector2[2] = sc.nextInt();
		vector2[3] = sc.nextInt();
		vector2[4] = sc.nextInt();
		vector2[5] = sc.nextInt();
		vector2[6] = sc.nextInt();
		vector2[7] = sc.nextInt();
		vector2[8] = sc.nextInt();
		vector2[9] = sc.nextInt();
		// Declaro y asigno los valores del tercer vector

		int[] vector3;
		vector3 = new int[20];
		int j = 0;
		for (int i = 0; i < 10; i++) {
			vector3[j] = vector1[i];
			j++;
			vector3[j] = vector2[i];
			j++;
		}

		for (j = 0; j < 20; j++) {
			System.out.println("Vector 3= " + vector3[j]);
		}

	}

}
