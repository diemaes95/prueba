package Ejercicios;

/*
 * Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc. 
 */
import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Declaracion de varibles
		int i, contador = 0; // i hará de contador al introducir el valor del array, contador a la hora de
		// mostrarlo.
		boolean inicio = true; // Nos permitira saber cuando mostrar el array por el principio o por el final.
		int[] lista;
		lista = new int[10];

		// Asignamos valores al array
		// Asignamos 10 valores al array
		for (i = 0; i < lista.length; i++) {
			System.out.println("Introduzca un numero:");
			lista[i] = entrada.nextInt();
		}

		// Bucle para imprimir, comenzará por el principio ya que inicio = true
		for (i = 0; i < 10; i++) {

			if (inicio == true) {
				System.out.println(lista[i - i / 2]);	// i - i/2 ya que lo va a imprimir 1 de cada 2 veces
				inicio = false;
			} else {
				System.out.println(lista[9 - contador]);
				contador++;
				inicio = true;
			}

		}

	}

}
