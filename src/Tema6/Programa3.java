package Tema6;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES
		
		int[] vector1;
		vector1 = new int[5];
		
		double medianegativo = 0;
		double mediapositivo = 0;
		
		double numnegativo = 0;
		double numpositivo = 0;
		
		int positivo = 0;
		int negativo= 0;
		int cero = 0;
		
		
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<5; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// SE RECORRE EL ARRAY PARA CONTAR LOS NUMEROS NEGATIVOS, POSITIVOS Y LOS CEROS
		// SE SUMAN LOS NUMEROS POSITIVOS CON POSITIVOS Y NEGATIVOS CON NEGATIVOS
		for (int i=0; i<5; i++) {
			if (vector1[i] < 0) {
				numnegativo = numnegativo + vector1[i];
				negativo++;
			}else {
				if (vector1[i] > 0) {
					numpositivo = numpositivo + vector1[i];
					positivo++;
				}else {
					cero++;
				}
			}
		}
		
		// SE SACA LA INFORMACION POR PANTALLA
		
		System.out.println("Vector1: \n");
		
		System.out.print("Media de los negativos: ");
		medianegativo = numnegativo/negativo;
		System.out.print(medianegativo);
		System.out.println("\n");
		
		System.out.print("Media de los positivos: ");
		mediapositivo = numpositivo/positivo;
		System.out.print(mediapositivo);
		System.out.println("\n");
		
		System.out.print("Numero de ceros: ");
		System.out.println(cero);
	}

}