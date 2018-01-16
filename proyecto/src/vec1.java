import java.util.Scanner;

public class vec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 5;
		int[] vector1;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("El vector es: ");
		
		// Imprime el vector
		for(int i = 0; i <= 4; i++) {
			System.out.println(vector1[i]);
			
		}
	}
}