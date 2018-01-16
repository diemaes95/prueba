package Ejercicios;
/*
 * Leer por teclado una serie de 10 números enteros.
 *  La aplicación debe indicarnos si los números están 
 *  ordenados de forma creciente, decreciente, o si están desordenados.
 */
import java.util.*;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables 
		int i;
		int[] enteros;
		enteros = new int[10];
		boolean creciente = true, decreciente = true;	//Saber si estan ordenados y de que manera
		
		//Leer los 10 nº enteros
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un numero entero:");
			enteros[i] = entrada.nextInt();
		}
		
		//Comprobar si estan ordenados 
		for(i = 0; i < 8; i++) {
			if(enteros[i] < enteros[i + 1]) {	
				decreciente = false;
			}else {
				if(enteros[i] > enteros[i + 1]) {
					creciente = false;
				}
			}
		}
		
		//Salida en caso de que sea creciente / decreciente / desordenado
		if(creciente == true) {
			System.out.println("Esta ordenado de manera creciente.");
		}else {
			if(decreciente == true) {
				System.out.println("Esta ordenado de manera decreciente.");
			}else {
				if(creciente == false && decreciente == false) {
					System.out.println("Esta desordenado.");
				}
			}
		}
		
	}

}
