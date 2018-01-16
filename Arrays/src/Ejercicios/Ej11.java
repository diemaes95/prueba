package Ejercicios;

/*
 * Leer 5 elementos enteros que se introducirán ordenados de forma creciente.
 *Éstos los guardaremos en un array de tamaño 10. Leer un número N, e
 *insertarlo en el lugar adecuado para que el array continúe ordenado. 
 */
import java.util.*;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int i, tmp, contador;
		int[] enteros;
		enteros = new int[10];

		// INTRODUCIR LOS 5 PRIMEROS ENTEROS
		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca un numero: ");
			enteros[i] = entrada.nextInt();

			while (i != 0 && (enteros[i] < enteros[i - 1])) {
				System.out.println("Introduzca un numero que sea mayor o igual" + "\n" + "que el anterior.");
				enteros[i] = entrada.nextInt();
			}
		}

		// INTRODUCIMOS LOS 5 NUMEROS RESTANTES
		for (i = 5; i < 10; i++) {
			System.out.println("Introduzca un numero:");
			enteros[i] = entrada.nextInt();
			tmp = enteros[i];
			contador = i - 1;
			
			for(contador = contador;contador >= 0 && tmp <= enteros[contador]; contador --) {
				if(tmp <= enteros[contador] && contador != 0) {
					enteros[contador + 1] = enteros[contador];
					enteros[contador] = tmp;
				}else {
					enteros[contador + 1] = enteros[0];
					enteros[0] = tmp;
				}
			}
		}	

		// Mostramos el array para comprobar si esta correcto
		for (i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}

	}

}
