package Ejercicios;

/*
 * Diseñar una aplicación que declare un array de 10 elementos enteros. 
 * Leer mediante el teclado 8 números. Después se debe pedir un número
 * y una posición, insertarlo en la posición indicada, desplazando los
 * que estén detrás. 
 */
import java.util.*;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaracion de variables
		int[] enteros;
		enteros = new int[10];
		int i, posicion, comprobar;

		// Leer por teclado
		for (i = 0; i < enteros.length; i++) {
			if (i == 9) {
				System.out.println("¿En que posicion desea insertar el entero?:");
				posicion = entrada.nextInt();

				for (comprobar = 8; comprobar >= 0; comprobar--) { // COMPROBAMOS QUE POSICIONES SON MAYORES
					if (posicion <= comprobar) {
						enteros[comprobar + 1] = enteros[comprobar]; // LAS POSICIONES MAYORES O IGUALES PASAN A LA
																		// POSICION SIGUIENTE
					}
				}

				System.out.println("Introduzca un numero:"); // INTRODUCIMOS EL VALOR TRAS EL BUCLE
				enteros[posicion] = entrada.nextInt();
			} else {
				System.out.println("Introduzca un numero:");
				enteros[i] = entrada.nextInt();
			}
		}
		
		for(i = 0; i < enteros.length;i++) {
			System.out.println(enteros[i]);
		}

	}

}
