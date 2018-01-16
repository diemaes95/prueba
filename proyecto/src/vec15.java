import java.util.Scanner;

// Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en el array. Se
// debe mostrar la posición en que se encuentra. Si no está, indicarlo con un
// mensaje.

public class vec15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1;
		int numerito;
		boolean encontrado = false;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < 10; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("Introduzca un valor a buscar ");
		numerito = entrada.nextInt();
		
		// Comprueba si esta el numero
		for(int i = 0; i <= 9; i++) {
			if (vector1[i] == numerito) {
				System.out.println("Su valor se encuentra en la posicion " + i);
				encontrado = true;
			} 
		}	
		
		if (encontrado == false) {
			System.out.println("No se ha encontrado su valor");
		}
	}
}