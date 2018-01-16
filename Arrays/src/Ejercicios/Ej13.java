package Ejercicios;
/*
 *Leer 10 enteros. Guardar en otro array
 *los elementos pares de la primera, y
 *a continuación los elementos impares. Realizar dos versiones:
 *una trabajando con los valores y otra trabajando con los índices. 
 */
import java.util.*;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Trabajando con valores
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, k = 0;
		int[]enteros1;
		enteros1 = new int[10];
		int[]enteros2;
		enteros2 = new int[10];
		
		//damos valores a enteros 1
		for(i = 0;i < enteros1.length;i++) {
			System.out.println("Introduzca un numero:");
			enteros1[i] = entrada.nextInt();
		}
		
		//Bucle para asignar valores pares
		for(i = 0;i < enteros1.length;i++) {//Bucle para recorrer enteros1
			if(enteros1[i] % 2 == 0) {
				enteros2[k] = enteros1[i];
				k++;
			}
		}
		
		//Bucle para asignar valores impares
		for(i = 0;i < enteros1.length;i++) {
			if(enteros1[i] % 2 != 0) {
				enteros2[k] = enteros1[i];
				k++;
			}
		}
		
		for(i = 0;i < enteros2.length;i++) {
			System.out.println(enteros2[i]);
		}
		
	}

}
