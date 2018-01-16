package Ejercicios;

/*
 * Leer 5 números por teclado y a continuación realizar
 *la media de los números positivos, la media de los negativos
 *y contar el número de ceros. 
 */
import java.util.*;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaracion de variables
		int i, suma = 0, div = 0, ceros = 0;
		double media;
		int[] enteros;
		enteros = new int[5];

		// Valores enteros[]
		for (i = 0; i < enteros.length; i++) {
			System.out.println("Introduzca un numero:");
			enteros[i] = entrada.nextInt();

			// Si se introduce un 0 se incrementa ceros
			if (enteros[i] == 0) {
				ceros++;
			}
		}

		// Numeros negativos
		for (i = 0; i < enteros.length; i++) {
			if (enteros[i] < 0) {
				div++;
				suma = suma + enteros[i];
			}
		}

		// Media negativos
		if (div > 0) {
			media = suma / div;
			System.out.println("La media de los negativos es " + media);
		} else {
			System.out.println("No hay numeros negativos.");
		}

		// Volvemos a inicializar suma y div en 0
		suma = 0;
		div = 0;

		// Numeros positivos
		for (i = 0; i < enteros.length; i++) {
			if (enteros[i] > 0) {
				div++;
				suma = suma + enteros[i];
			}
		}

		// Media positivos
		if (div > 0) {
			media = suma / div;
			System.out.println("La media de los positivos es " + media);
		} else {
			System.out.println("No hay numeros positivos.");
		}

		// Cantidad de 0
		System.out.println("Hay " + ceros + " ceros.");
	}

}
