package Tema6;
import java.util.*;
public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARACION DE VARIABLES
		
		int[] vector1;
		vector1 = new int[5];
		
		
		// RECORRE EL ARRAY PARA INTRODUCIR LOS VALORES
		System.out.println("Introduzca los valores para el vector 1\n");
		for (int i=0; i<5; i++) {
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}
		
		// MUESTRA POR PANTALLA LOS VALORES INTRODUCIDOS EN EL ORDEN QUE HAN SIDO INTRODUCIDOS
		System.out.println("Vector1: ");
		for (int i=0; i<5; i++) {
			System.out.println(vector1[i]);
		}
	}

}
