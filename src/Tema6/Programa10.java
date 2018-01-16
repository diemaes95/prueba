package Tema6;
import java.util.*;
public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
	
		int[] vector1;
		vector1 = new int[10];

		System.out.println("Introduzca un valor para el vector1: \n");
		for (int i = 0; i < 10; i++) {
			
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}

		for (int i = 0; i < 10; i++) {

			System.out.println(vector1[i]);

		}
		System.out.print("\n");

		System.out.println("Indique cuantas posiciones quiere desplazarlo");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {			

			int aux = vector1[9];
			
			for (int j = 9; j > 0; j--) { 
				vector1[j] = vector1[j-1];
			}
			vector1[0] = aux;

		}
		for (int i = 0; i < 10; i++) {

			System.out.println(vector1[i]);			

		}
	}

}

