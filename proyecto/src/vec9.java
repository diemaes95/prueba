import java.util.Scanner;

// Crear un programa que lea por teclado un array de 10 números enteros y lo
// desplace una posición hacia abajo (el último pasa a ser el primero). 

public class vec9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1, vector2;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < 10; i++) {
			vector1[i] = entrada.nextInt();
		}

		vector2[0] = vector1[9];
		for(int i = 1; i < 10; i++) {
			vector2[i] = vector1[i-1];
		}
		
		// Imprime el vector
		System.out.println("Vector desplazado: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(vector2[i]);
		}		
	}
}