package unidad6Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] vector;
		vector = new int[5];
		double positivo = 0, negativo = 0;
		double conP = 0, conN = 0;
		int ceros = 0;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Introducir valor: ");
			vector[i] = entrada.nextInt();
			
			if (vector[i] == 0) {
				ceros++;
			}
			else {
				if (vector[i] > 0) {
					conP++;
					positivo += vector[i];
				}
				else {
					conN++;
					negativo += vector[i];
				}
			}
		}
		
		double resulP = positivo/conP;
		double resulN = negativo/conN;
		
		System.out.println("Los ceros son: " + ceros);
		System.out.println("La media de los negativos es: " + resulN);
		System.out.println("La media de los positivos es: " + resulP);
	}

}
