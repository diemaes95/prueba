import java.util.Scanner;

// Leer por teclado dos arrays de 10 números enteros y mezclarlas en un tercero
// de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 


public class vec5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1, vector2;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector 1: ");
		
		// Llena el vector 1
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("Introduzca valores al vector 2: ");
		
		// Llena el vector 2
		for(int i = 0; i < TOPE; i++) {
			vector2[i] = entrada.nextInt();
		}
		
		System.out.println("El vector es: ");
		
		// Imprime el vector
		for(int i = 0, j = 0; i <= 9 && j <= 9; i++, j++){
			System.out.println(vector1[i]);
			System.out.println(vector2[j]);
		}
	}
}