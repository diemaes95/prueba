import java.util.Scanner;
public class Ejercicio11 { // Puto retrasado de mierda no te quiero a mi lado :)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//variables//
			int	numero, i, temp, j=0, indice ;
			
		//vector//
			int[] vector;
			vector = new int[10];
			
		// filtro//
			
			System.out.println("Introduzca el número para la posición " + 0 + " del vector.");
			numero = entrada.nextInt();
			vector[0] = numero;
			
		for(i = 1; i<5; i++ ) { 
			do {
				System.out.println("Introduzca el número para la posición " + i + " del vector.");
				System.out.println("El número a de ser mayor que el anterior");
				numero = entrada.nextInt();
				vector[i] = numero;
			} while (vector[i]<vector[i-1]);
		}
			
		// proceso//
		
		System.out.println("Introduzca el número para introducir en el vector.");
		numero = entrada.nextInt();
		while (vector[j]<numero && j!=9) {
			if (numero < vector[j]) {
				indice = j;
			} else {
				j++;
			}
		}
		
		
		for (i=vector.length-1; i>j; i--) {
			vector[i] = vector[i-1];
		}
		
		vector[j] = numero;
		
		//imprimir//
				for (i = 0; i < vector.length; i++) {
					System.out.println("\n Posición " + i + " | Valor " + vector[i]);
				}
				
		
	}

}
