package Ejercicios;

import java.util.*;

/*
 * 6. Leer los datos correspondientes a dos arrays de 12 elementos enteros,
 *  y mezclarlos en un tercer array de la forma: 3 de la tabla A, 3 de la B,
 *   otros 3 de A, otros 3 de la B, etc.
 */

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, posicionA = 0, posicionB = 0, contador = 0;
		boolean ciclo = true;	//Para saber cuando se han introducido 3 nº en el array 3.
		int[]enterosA;
		enterosA = new int[12];
		int[]enterosB;
		enterosB = new int[12];
		int[]enterosC;
		enterosC = new int[24];
		
		//Damos valores a enterosA
		for(i = 0; i < enterosA.length; i++) {
			System.out.println("Introduzca un numero para el array A:");
			enterosA[i] = entrada.nextInt();
		}
		
		//enterosB valores
		for(i = 0;i < enterosB.length;i++) {
			System.out.println("Introduzca un numero para el array B:");
			enterosB[i] = entrada.nextInt();
		}
		
		//Comenzamos a darle valores al array C
		for(i = 0;i < enterosC.length;i++) {
			if(ciclo == true) {
				enterosC[i] = enterosA[posicionA];
				posicionA++;
				contador++;
			}else {
				enterosC[i] = enterosB[posicionB];
				posicionB++;
				contador++;
			}
			
			if(contador == 3 && ciclo == true) {
				ciclo = false;
				contador = 0;
			}else {
				if(contador == 3 && ciclo == false) {
					ciclo = true;
					contador = 0;
				}
			}
		}
		
		for(i = 0; i < enterosC.length;i++) {
			System.out.println(enterosC[i]);
		}

	}

}
