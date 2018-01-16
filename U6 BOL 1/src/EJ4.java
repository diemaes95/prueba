import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Declaro el vector
		int[] vector1;
		vector1 = new int[10];
		System.out.println("Introduzca 10 números");
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

		// Imprimo
		for (int i = 0; i < 4; i++) { // Solo necesita recorrer la mitad del array
			System.out.println(vector1[i]);
			System.out.println(vector1[9 - i]);
		}

	}
}
