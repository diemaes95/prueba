import java.util.Scanner; // Te hackeo la vida subnormal
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); // De tu envidia nace mi fama
		
		//variables//
		int numero, i, indice; // xqxqxqxqxqxqxq
		
		//vector//
		
		int[] vector; // Puto perfecionista
		vector = new int[10];
		
		for(i = 0; i<vector.length; i++ ) { 
				System.out.println("Introduzca el número para la posición " + i + " del vector.");
				numero = entrada.nextInt();
				vector[i] = numero;
			}
		
		do {
			System.out.println("Introduzca un indice entre 0 y 9");
			indice = entrada.nextInt();
		} while (indice >= 10 || indice < 0);
	
		for (i = indice; i<vector.length-1; i++) {
			vector[i] = vector[i+1];
		}
		
		vector[9] = 0;
		
		//imprimir//
		for (i = 0; i < vector.length; i++) {
			System.out.println("\n Posición " + i + " | Valor " + vector[i]);
		}
		
	}

}
