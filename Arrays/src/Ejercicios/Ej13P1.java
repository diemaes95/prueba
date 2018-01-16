package Ejercicios;
import java.util.*;

public class Ej13P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, k = 0, t = 0, r = 0;
		int[] enteros;
		enteros = new int[10];
		
		//Insertamos los valores de enteros
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un valor entero:");
			enteros[i] = entrada.nextInt();
			
			if(enteros[i] % 2 == 0) {	//t para los impares y k pares.
				k++;
			}else {
				t++;
			}
		}
		
		//Creamos los arrays pares e impares unicamente si existieran dichos numeros
		int[] pares;
		pares = new int[k];
		int[] impares;
		impares = new int[t];
		
		//Creamos / Asignamos los valores pares
		if(k != 0) {			
			for(i = 0;i < enteros.length;i++) {
				if(enteros[i] % 2 == 0) {
					pares[r] = enteros[i];
					r++;
				}
			}
		}
		
		r = 0;	//Volvemos a poner el valor de r en cero para usarlo otra vez con los impares
		
		//Creamos / Asignamos los valores impares
		if(t != 0) {	
			for(i = 0;i < enteros.length;i++) {
				if(enteros[i] % 2 != 0) {
					impares[r] = enteros[i];
					r++;
				}
			}
			
		}
		
		//Mostramos el array pares si existe
		System.out.println("Array pares:");
		if(k != 0) {
			for(i = 0;i < pares.length;i++) {
				System.out.println(pares[i]);
			}
		}
		
		System.out.println("\n");
		
		//Mostramos el array impares
		System.out.println("Array impares:");
		if(t != 0) {
			for(i = 0;i < impares.length;i++) {
				System.out.println(impares[i]);
			}
		}
		

	}

}
