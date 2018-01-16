import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Variables
		double mediap = 0, median = 0;
		int numMed = 1, numMed2 = 1, numcero = 0;
		int sumap = 0, suman = 0;

		// Declaro el vector
		int[] vector1;
		vector1 = new int[5];
		System.out.println("Introduzca 5 números");
		vector1[0] = sc.nextInt();
		vector1[1] = sc.nextInt();
		vector1[2] = sc.nextInt();
		vector1[3] = sc.nextInt();
		vector1[4] = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (vector1[i] > 0) {
				sumap = vector1[i] + sumap;
				mediap = sumap / numMed;
				numMed++;
			} else {
				if (vector1[i] < 0) {
					suman = vector1[i] + suman;
					median = suman / numMed2;
					numMed2++;
				} else {
					if (vector1[i] == 0) {
						numcero++;
					}
				}

			}
		}
		System.out.println("Media de los números positivos: " + mediap);
		System.out.println("Media de los números negativos: " + median);
		System.out.println("Número de ceros: " + numcero);
	}

}