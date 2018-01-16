import java.util.Scanner;

// Leer 10 enteros. Guardar en otro array los elementos pares de la primera, y a
// continuación los elementos impares. Realizar dos versiones: una trabajando
// con los valores y otra trabajando con los índices. 

public class vec13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		final int TOPE = 10;
		int[] vector1, vector2;

		vector1 = new int[TOPE];
		vector2 = new int[TOPE];

		System.out.println("Introduzca valores al vector: \n");

		// Llena el vector 1
		for (int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}

		// Llena el vector 2 ---> version valores
		int j = 0;

		for (int i = 0; i < TOPE; i++) {
			if (vector1[i] % 2 == 0) {
				vector2[j] = vector1[i];
				j++;
			}
		}

		for (int i = 0; i < TOPE; i++) {
			if (vector1[i] % 2 != 0) {
				vector2[j] = vector1[i];
				j++;
			}
		}

		System.out.println("El vector ordenado es (version valores): \n");

		// Imprime el vector 3
		for (int i = 0; i < TOPE; i++) {
			System.out.println(vector2[i]);
		}

		// Llena el vector 2 ---> version indices
		int k = 0;

		for (int i = 0; i < TOPE; i++) {
			if (vector1[i] % 2 == 0) {
				vector2[k] = vector1[i];
				k++;
			}
		}

		for (int i = 0; i < TOPE; i++) {
			if (i % 2 != 0) {
				k = vector1[i];
				k++;
			}
		}

		System.out.println("El vector ordenado es (version indices): \n");

		// Imprime el vector 3
		for (int i = 0; i < TOPE; i++) {
			System.out.println(vector2[i]);
		}
	}
}