package Tema6;
import java.util.*;
public class Programa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[] vector1;
		vector1 = new int[10];
		
		int[] vector2;
		vector2 = new int[10];

		int[] vector3;
		vector3 = new int[20];

		int k = 19; 
		
		boolean hecho = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introducir solo valores crecientes para el vector1: \n");
			vector1[i] = entrada.nextInt();
		}
	
		for (int i = 0; i < 10; i++) {
			System.out.println("Introducir solo valores crecientes para el vector2: \n");
			vector2[i] = entrada.nextInt();
		}

		

		for (int i = 0; i < 10; i++) { 
			vector3[i] = vector1[i];
		}

		
		for (int i = 0; i < 10; i++) { 
										
			int n = vector2[i];

			hecho = false;
			int m = 0;

			while (hecho == false) { 
				if (vector3[m] > n) {

					for (int j = 19; j > m; j--) {
						vector3[j] = vector3[j - 1];
					}
					vector3[m] = n;
					hecho = true;
				}
				if (m == k) {		
					vector3[m] = n;
					hecho = true;
				}
				m++;

			}

		}
		for (int i = 0; i < 20; i++)
			System.out.println(vector3[i]);

	}

}

