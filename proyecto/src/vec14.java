import java.util.Scanner;

// Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar
// (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. 

public class vec14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		final int TOPE = 11;
		int[] vector1, vector2, vector3;
		int contadorJ = 0, contadorK = 0;

		vector1 = new int[TOPE];
		vector2 = new int[TOPE];
		vector3 = new int[20];

		System.out.println("Introduzca valores al vector 1: ");

		// Llena el vector 1
		for (int i = 0; i < 10; i++) {
			vector1[i] = entrada.nextInt();
		}

		System.out.println("Introduzca valores al vector 2: ");
		// Llena el vector 2
		for (int i = 0; i < 10; i++) {
			vector2[i] = entrada.nextInt();
		}
		
		vector1[10] = 99999999; // Tope
		vector2[10] = 99999999; // Tope
		
		// Llena el vector 3
		for (int i = 0, j = 0, k = 0; i < 20; i++) {
			if ((j < 10 ) && (vector1[j] <= vector2[k])){
				vector3[i] = vector1[j];
				j ++;			
			} else {
				vector3[i] = vector2[k];
				k ++;			
			}
		}

		// Imprime el vector
		System.out.println("El vector resultante es: ");
		for (int i = 0; i < 20; i++) {
			System.out.println(vector3[i]);
		}
	}
}