package Ejercicios;

/*
 * Leer dos series de 10 enteros, que estarán ordenados crecientemente.
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados
 */
import java.util.*;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaracion de variables
		int i, k = 0, t = 0;
		int[] enteros1;
		enteros1 = new int[10];
		int[] enteros2;
		enteros2 = new int[10];
		int[] enteros3;
		enteros3 = new int[20];

		// Valores enteros1
		for (i = 0; i < enteros1.length; i++) {
			System.out.println("Introduzca un numero:");
			enteros1[i] = entrada.nextInt();

			while (i != 0 && enteros1[i] < enteros1[i - 1]) {
				System.out.println("Debe introducir un numero mayor que el anterior:");
				enteros1[i] = entrada.nextInt();
			}
		}

		// Valores enteros2
		for (i = 0; i < enteros2.length; i++) {
			System.out.println("Introduzca un numero:");
			enteros2[i] = entrada.nextInt();

			while (i != 0 && enteros2[i] < enteros2[i - 1]) {
				System.out.println("Debe introducir un numero que sea menor que el anterior:");
				enteros2[i] = entrada.nextInt();
			}
		}

		// Valores enteros3
		for (i = 0; i < enteros3.length; i++) {

			// Durante el bucle iremos comparando los valores de enteros1 enteros2 y se
			// introducira aquel que sea menor.
			if (k < 10 || t < 10) {
				if (k >= 10) {
					enteros3[i] = enteros2[t];
					t++;
				} else {
					if (t >= 10) {
						enteros3[i] = enteros1[k];
						k++;
					} else {
						if (enteros1[k] < enteros2[t]) {
							enteros3[i] = enteros1[k];
							k++;
						} else {
							enteros3[i] = enteros2[t];
							t++;
						}
					}
				}
			}
		}

		// Imprimimos el array 3
		for (i = 0; i < enteros3.length; i++) {
			System.out.print(enteros3[i]);
		}

	}

}
