package Ejercicios;
/*
 * Leer por teclado dos arrays de 10 números enteros y mezclarlas en un tercero de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 
 */
import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, contador = 0;
		boolean numeroA = true;
		int[] numerosA;
		int[] numerosB;
		int[] numerosC;
		
		//Tamaño arrays
		numerosA = new int[10];
		numerosB = new int[10];
		numerosC = new int[20];
		
		//Entrada array a
		for(i = 0; i < numerosA.length; i++) {
			System.out.println("Introduzca un numero para el array A:");
			numerosA[i] = entrada.nextInt();
			
		}
		
		System.out.println("\n");
		
		//entrada array b 
		for(i = 0; i < numerosB.length; i++) {
			System.out.println("Introduzca un numero para el array B:");
			numerosB[i] = entrada.nextInt();
		}
		
		//Array C, 
		for(i = 0; i < numerosC.length; i++) {
			if(numeroA == true) {
				numerosC[i] = numerosA[i - i/2];
				numeroA = false;
			}else {
				numerosC[i] = numerosB[contador];
				contador++;
				numeroA = true;
			}
		
			//Imprimimos por pantalla el array para comprobar si es correcto
			System.out.println(numerosC[i]);
			
		}
		
		
		
		
		
		
	}

}
