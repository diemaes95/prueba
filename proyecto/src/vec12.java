import java.util.Scanner;

// Leer por teclado un array de 10 números enteros y leer una posición (entre 0 y
// 9). Eliminar el elemento situado en la posición dada sin dejar huecos. 

public class vec12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1;
		int pos;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: \n");
		
		// Llena el vector
		for(int i = 0; i < 10; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("Introduzca una posición a borrar \n");
		pos = entrada.nextInt();
		
		for (int x = pos; x < vector1.length-1; x++) {
			vector1[x] = vector1[x+1];
		}
		
		vector1[9] = 0;
		
		// Imprime el vector
		for(int i = 0; i <= 9; i++) {
			System.out.println(vector1[i]);
		}		
	}
}