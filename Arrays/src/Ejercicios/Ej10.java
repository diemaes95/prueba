package Ejercicios;

/*
 * Ídem, desplazar N posiciones (N es introducido por el usuario).
 */
import java.util.*;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaracion de variables
		int i, tmp, posiciones;
		int[] enteros;
		enteros = new int[10];

		// Introducimos los valores del array
		for (i = 0; i < enteros.length; i++) {
			System.out.println("Introduzca un enteros:");
			enteros[i] = entrada.nextInt();
		}

		// Desplazar posiciones
		System.out.println("Posiciones que quieres desplazar");
		posiciones = entrada.nextInt();

		for (posiciones = posiciones; posiciones > 0; posiciones--) {// repite el desplazamiento

			tmp = enteros[9]; // Para que no se pierda al comienzo del bucle

			for (i = 9; i >= 0; i--) { // Se encarga de desplazar los numeros
				if (i != 0) {
					enteros[i] = enteros[i - 1];
				} else {
					enteros[0] = tmp;
				}
			}
		}
		
		//Imprimimos para comprobar si esta bien
		for(i = 0;i < enteros.length;i++) {
			System.out.println(enteros[i]);
		}
	}

}
