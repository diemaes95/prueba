import java.util.Scanner;

// Leer 5 números por teclado y a continuación realizar la media de los números
// positivos, la media de los negativos y contar el número de ceros. 

public class vec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 5;
		int[] vector1;
		int contPositivos = 0, contNegativos = 0, contCeros = 0;
		double mediaPositivos = 0, mediaNegativos = 0;
		
		vector1 = new int [TOPE];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		// Imprime el vector
		for(int i = 0; i <= 4; i++) {
			if (vector1[i] > 0) {
				contPositivos ++;
				mediaPositivos += vector1[i];
			} else {
				if (vector1[i] < 0) {
					contNegativos ++;
					mediaNegativos += vector1[i];
				} else {
					contCeros ++;
				}
			}
		}
		
		if (contPositivos > 0) {
			mediaPositivos /= contPositivos;
		}
		
		if (contNegativos > 0) {
			mediaNegativos /= contNegativos;
		}
		
		// Salidas
		System.out.println("La media de positivos es: " + mediaPositivos);
		System.out.println("La media de negativos es: " + mediaNegativos);
		System.out.println("El numero de ceros es: " + contCeros);
	}
}