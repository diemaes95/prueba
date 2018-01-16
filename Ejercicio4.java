package unidad6Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] vector;
		vector = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Introducir valor: ");
			vector[i] = entrada.nextInt();
		}
		
		for (int i = 0; i <= 4; i++) {
			System.out.print(vector[i] + " ");
			System.out.print(vector[9-i] + " ");
		}
	}

}
