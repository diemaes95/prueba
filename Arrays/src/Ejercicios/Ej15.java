package Ejercicios;
/*
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en el array.
 *  Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
 *con un mensaje. 
 */
import java.util.*;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, k;
		boolean esta = false;	//Indica si se encuentra el numero.
		int[]enteros;
		enteros = new int[10];
		
		//Valores enteros
		for(i = 0;i < enteros.length;i++) {
			System.out.println("Introduzca un numero:");
			enteros[i] = entrada.nextInt();
			
			while(i != 0 && enteros[i] < enteros[i - 1]) {
				System.out.println("El numero introducido debe ser mayor o igual que el anterior:");
				enteros[i] = entrada.nextInt();
			}
		}
		
		System.out.println("Que numero desea buscar:");
		k = entrada.nextInt();
		
		//Bucle para ver si se encuentra el valor.
		for(i = 0;i < enteros.length;i++) {
			if(k == enteros[i]) {
				System.out.println("Si, esta en la posicion "+i);
				esta = true;
			}	
		}
		
		if(esta == false) {
			System.out.println("El numero introducido no se encuentra.");
		}
		
	}

}
