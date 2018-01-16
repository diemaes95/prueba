package Tema6;

import java.util.*;

public class Programa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARAMOS LOS ARRAYS
		int[] vector1;
		vector1 = new int[12];
		
		int[] vector2;
		vector2 = new int[12];
		
		int[] vector3;
		vector3 = new int[24];
		
		// RECORREMOS Y LEEMOS LOS ARRAY
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<12; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		
		System.out.println("Introduzca los valores para el vector 2\n");
		for (int i=0; i<12; i++) {
			vector2[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// DECLARAMOS UNA VARIABLE CONTADOR
		int c = 0;
		
		
		// RELLENAMOS EL ARRAY
		System.out.println("Vector3: ");
		for (int i=0; i<4; i++) {
		
			for (int j=0, a=i*6; j<3; j++,a++) {	// LA a VA A RELLENAR EL ARRAY vector3 DE 6 EN 6
				
				vector3[a] = vector1[c];
						
				vector3[a+3] = vector2[c];
				
				
				c++;
			}

		}
		
		// SE RECORRE EL ARRAY vector3 Y SE MUESTRA POR PANTALLA
		for (int i=0; i<24; i++) {
			
			System.out.println(vector3[i]);
		}
	}
}
