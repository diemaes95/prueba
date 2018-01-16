package Tema6;
import java.util.*;
public class Programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
										
		int[] vector1;
		vector1 = new int[10];
		
		boolean hecho = false;

		System.out.println("Introducir solo valores en orden creciente");
		int j = 5;
		for (int i = 0; i < j; i++) {			
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido");
		}

		System.out.println("Introduzca un valor");
		int n = entrada.nextInt();

		int m = 0;
		while (hecho == false) {		

			if (vector1[m] > n) {

				for (int i = 9; i > m; i--) {
					vector1[i] = vector1[i - 1];
				}
				vector1[m] = n;
				hecho = true;
			}
			if (m == j) {
				vector1[m] = n;
				hecho = true;
			}

			m++;

		}
		for (int i = 0; i < 10; i++)
			System.out.println(vector1[i]);

	}

}

