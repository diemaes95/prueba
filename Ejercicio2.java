package unidad6Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] vector;
		vector = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Introducir valor: ");
			vector[i] = entrada.nextInt();
		}
		
		for (int i = 4; i >= 0; i--) {
			System.out.print(vector[i] + " ");
		}
		
	}

}
