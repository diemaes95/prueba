import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Declaro el vector
		int[] vector1;
		vector1 = new int[5];
		System.out.println("Introduzca 5 números");
		vector1[0] = sc.nextInt();
		vector1[1] = sc.nextInt();
		vector1[2] = sc.nextInt();
		vector1[3] = sc.nextInt();
		vector1[4] = sc.nextInt();

		// Imprimo
		for (int i = 0; i < 5; i++) {
			System.out.println(vector1[i]);
		}

	}

}
