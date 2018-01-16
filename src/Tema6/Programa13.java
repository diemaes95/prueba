package Tema6;
import java.util.*;
public class Programa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[] vector; 
		vector = new int[10];

		int[] vectorp; 
		vectorp = new int[10];

		int[] vectori; 
		vectori = new int[10];

		
		System.out.println("Introducir un valor");
		for (int n = 0; n < 10; n++) {
			vector[n] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}

		int n = 0;
		int m = 0;


		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				vectorp[m] = vector[i];
				m++;
			} else {
				vectori[n] = vector[i];
				n++;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(vectorp[i]);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(vectori[i]);
		}

	}

}

