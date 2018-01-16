import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//variables//
		int numero, i, cont=0;
				
		//vector//
				
		int[] vector;
		vector = new int[10];
		
		int[] vector2;
		vector2 = new int[10];
		
		for(i = 0; i<vector.length; i++ ) { 
			System.out.println("Introduzca el número para la posición " + i + " del vector.");
			numero = entrada.nextInt();
			vector[i] = numero;
		}
		
		for (i = 0; i<vector.length; i++) {
			if (vector[i]%2==0) {
				vector2[i] = vector[i];
				cont++;
			}
		}
	}

}
