package Ejercicios;
import java.util.*;

public class Ej13P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Indices:
		
		//Declaracion de variables
		int i, k = 0, t = 0, r = 0;
		int[] enteros;
		enteros = new int[10];
		int[] pares;
		pares = new int[5];
		int[] impares;
		impares = new int[5];
		
		//Introducimos los valores enteros
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un valor entero:");
			enteros[i] = entrada.nextInt();
			
			if(i % 2 == 0) {
				pares[k] = enteros[i];
				k++;
			}else {
				impares[t] = enteros[i];
				t++;
			}
		}
		
		//Imprimimos el array pares
		System.out.println("El valor de los indices pares es:");
		for(i = 0;i < pares.length;i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("\n");
		
		//Imprimimos el array impares
		System.out.println("El valor de los indices impares es:");
		for(i = 0;i < impares.length;i++) {
			System.out.println(impares[i]);
		}

	}

}
