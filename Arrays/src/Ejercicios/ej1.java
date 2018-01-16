package Ejercicios;
import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//declaracion de variables
		int i;
		
		//Declaracion del array 
		int[] lista;
		lista = new int[5];
		
		for(i = 0;i < lista.length;i++) {
			System.out.println("Introduzca un numero:");
			lista[i] = entrada.nextInt();
		}
		
		for(i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
