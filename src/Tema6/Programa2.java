package Tema6;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// SE DECLARAN LOS ARRAYS
		int[] vector1;
		vector1 = new int[5];
		
		// RECORREMOS EL ARRAY ENTERO
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<5; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// LO MOSTRAMOS EN PANTALLA RECORRIENDOLO INVERSAMENTE
		System.out.println("Vector1: ");
		for (int i=4; i>=0; i--) {
			System.out.println(vector1[i]);
		}
	}
}