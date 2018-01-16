package Tema6;

import java.util.*;
public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARAMOS LOS ARRAYS
		int[] vector1;
		vector1 = new int[10];
		
		// RECORREMOS EL ARRAY
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<10; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// MOSTRAMOS POR PANTALLA EL ARRAY EN EL ORDEN (PRIMERO,ULTIMO,SEGUNDO,PENULTIMO...)
		System.out.println("Vector1: ");
		for (int i=0; i<5; i++) {
			System.out.println(vector1[i]);
			
			System.out.println(vector1[9-i]);
			}
		}
	}


