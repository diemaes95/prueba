import java.util.Scanner;

// Leer los datos correspondientes a dos arrays de 12 elementos enteros, y
// mezclarlos en un tercer array de la forma: 3 de la tabla A, 3 de la B, otros 3 de
// A, otros 3 de la B, etc

public class vec6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 12;
		int[] vector1, vector2, vector3;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		vector3 = new int [24];
		
		System.out.println("Introduzca valores al vector: ");
		
		// Llena el vector 1
		for(int i = 0; i < TOPE; i++) {
			vector1[i] = entrada.nextInt();
		}
		
		System.out.println("Introduzca valores al vector 2: ");
		
		// Llena el vector 2
		for(int i = 0; i < TOPE; i++) {
			vector2[i] = entrada.nextInt();
		}
		
		System.out.println("El vector es: ");
		
		// LLena el vector 3
		for(int i = 0, j = 0, k = 0; i <= 11 && j <= 11; i++, j++, k++){
			vector3[k] = vector1[i];
			i ++; 
			k++;
			vector3[k] = vector1[i];
			i ++; 
			k++;
			vector3[k] = vector1[i];
			k++;
			vector3[k] = vector2[j];
			j ++;
			k++;
			vector3[k] = vector2[j];
			j ++;
			k++;
			vector3[k] = vector2[j];
		}
		
		// Imprime el vector3
		for(int i = 0; i <= 23; i++) {
			System.out.println(vector3[i]);
					
		}
	}
}