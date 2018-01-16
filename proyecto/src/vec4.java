import java.util.Scanner;

// Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el
// primero, el último, el segundo, el penúltimo, el tercero, etc. 

public class vec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("El vector es: ");
		
		// Imprime el vector
		for(int i = 0, j = 9; i <= 4 && j >= 4; i++, j--){
			System.out.println(vector1[i]);
			System.out.println(vector1[j]);
		}
	}
}