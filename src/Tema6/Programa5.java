package Tema6;

import java.util.*;

public class Programa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARAMOS LOS ARRAYS
		int[] vector1;
		vector1 = new int[10];
		
		int[] vector2;
		vector2 = new int[10];
		
		int[] vector3;
		vector3 = new int[20];
		
		// RECORREMOS Y LEEMOS LOS ARRAY
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<10; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		
		System.out.println("Introduzca los valores para el vector 2\n");
		for (int i=0; i<10; i++) {
			vector2[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// DECLARAMOS UNA VARIABLE CONTADOR
		int n = 0;
		
		System.out.println("Vector3: ");
		for (int i=0; i<20; i++) {
			
			// CON DOS CONTADORES, PODEMOS RECORRER UN ARRAY, RECORRIENDO OTROS DOS ARRAYS A LA VEZ
			vector3[i] = vector1[n];
			System.out.println(vector3[i]);
			
			i++;
			vector3[i] = vector2[n];
			System.out.println(vector3[i]);
			n++;
			}
		}
	}
