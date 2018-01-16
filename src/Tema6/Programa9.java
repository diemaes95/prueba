package Tema6;
import java.util.*;
public class Programa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// DECLARAMOS LOS ARRAYS
		int[] vector1;
		vector1 = new int[10];
		
		// RECORREMOS EL ARRAY PARA RELLENARLO
		System.out.println("Introduzca los valores para el vector\n");
		for (int i=0; i<10;i++) {
			
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}	
		
		// MOSTRAMOS EL ARRAY SIN MODIFICAR
		for (int i=0; i<10;i++) {
			System.out.println("Vector sin modificar: ");
			System.out.println(vector1[i]);
		}
		System.out.println("\n");
		System.out.println("------------------");
		
		// CREAMOS UNA VARIABLE AUXILIAR PARA GUARDAR LA ULTIMA POSICION DEL VECTOR
		
		int aux;
		aux = vector1[9];
		
		for (int i=9; i > 0; i--) {
			vector1[i] = vector1[i-1];
		}
		// SUSTITUIMOS LA PRIMERA POSICION DEL VECTOR POR LA QUE HABIAMOS GUARDADO CON LA VARIABLE AUX
		vector1[0] = aux;
		
		// MOSTRAMOS EL ARRAY MODIFICADO
		for (int i=0; i<10;i++) {
			System.out.println("Vector Modificado: ");
			System.out.println(vector1[i]);
		}
	}

}
