import java.util.Scanner;

// Leer por teclado una serie de 10 números enteros. La aplicación debe
// indicarnos si los números están ordenados de forma creciente, decreciente, o si
// están desordenados. 

public class vec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1;
		boolean ordenadosAs = true, ordenadosDes = true;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("El vector es: ");
		
		// Comprueba si estan ordenados ascendentemente
		for (int i = 0; i < 9; i++) {
			if (vector1[i] <= vector1[i+1]) {

			} else {
				ordenadosAs = false;
			}
		}
		
		// Comprueba si estan ordenados descendentemente
		for (int i = 0; i < 9; i++) {
			if (vector1[i] >= vector1[i+1]) {

			} else {
				ordenadosDes = false;
			}
		}
		
		if (ordenadosAs) {
			System.out.println("Ordenados Ascendente");
		} else {
			if (ordenadosDes) {
				System.out.println("Ordenados Descendente");
			} else {
				System.out.println("No Ordenados");
			}
		}
	}
}