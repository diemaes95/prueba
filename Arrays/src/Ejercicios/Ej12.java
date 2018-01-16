package Ejercicios;
/*
 * Leer por teclado un array de 10 números enteros y leer una posición (entre 0 y 9).
 * Eliminar el elemento situado en la posición dada sin dejar huecos. 
 */
import java.util.*;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, hueco;
		int[] enteros;
		enteros = new int[10];
		int[] enteros2;	//Nuevo array que almacena los valores del anterior menos el eliminado
		enteros2 = new int[9];
		
		//Damos valores al array
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un numero:");
			enteros[i] = entrada.nextInt();
		}
		
		System.out.println("Que hueco desea eliminar:");
		hueco = entrada.nextInt();
		
		//Bucle para eliminar elemento
		for(hueco = hueco;hueco >= 0;hueco--) {
			if(hueco != 0) {
				enteros[hueco] = enteros[hueco - 1];
			}else {
				enteros[0] = 0;
			}
		}
		
		//Asignamos los valores a enteros2 con el hueco eliminado
		for(i = 8;i >= 0;i--) {
			enteros2[i] = enteros[i + 1];
		}
		
		//Imprimimos el array
		for(i = 0;i < enteros2.length;i++) {
			System.out.println(enteros2[i]);
		}

	}

}
