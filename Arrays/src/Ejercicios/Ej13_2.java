package Ejercicios;
import java.util.*;

public class Ej13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Version con indices
		
		Scanner entrada = new Scanner(System.in);
		
		//Decalaracion de variables
		int i, k = 0;
		int[] enteros;
		int[] ordenados;
		enteros = new int[10];
		ordenados = new int[10];
		
		//Damos valor a enteros
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un valor entero:");
			enteros[i] = entrada.nextInt();
		}
		
		//ponemos los indices pares en el array ordenados
		for(i = 0;i < enteros.length;i++) {
			if(i % 2 == 0) {
				ordenados[k] = enteros[i];
				k++;
			}
		}
		
		//ponemos los indices impares
		for(i = 0;i < enteros.length;i++) {
			if(i % 2 != 0) {
				ordenados[k] = enteros[i];
				k++;
			}
		}
		
		System.out.println("\n"+"Valor del array ordenados:");
		
		//Imprimimos el array para ver si es correcto
		for(i = 0;i < ordenados.length;i++) {
			System.out.println(ordenados[i]);
		}

	}

}
