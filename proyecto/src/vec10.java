import java.util.Scanner;

// Ídem, desplazar N posiciones (N es introducido por el usuario). 

public class vec10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 10;
		int[] vector1, vector2;
		int desplazo;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < 10; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("Introduzca el desplazo: ");
		desplazo = entrada.nextInt();
		
		for (int i = 0, j = 9, k = desplazo; j > 0; i++, j--, k--) {
			vector2[i] = vector1[j];
		}
				
		for (int i = desplazo; i < 10; i++) {
			vector2[i] = vector1[i-desplazo];
		}
		
		// Imprime el vector
		System.out.println("Vector desplazado: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(vector2[i]);
		}		
	}
}