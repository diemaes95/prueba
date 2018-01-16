package Ejercicios;
/*
 * Crear un programa que lea por teclado un array de 10
 * números enteros y lo desplace una posición hacia abajo
 *(el último pasa a ser el primero). 
 */
import java.util.*;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i, tmp;
		int[] enteros;
		enteros = new int[10];
		
		//Damos valores a el array
		for(i = 0; i < enteros.length;i++) {
			System.out.println("Introduzca un numero:");
			enteros[i] = entrada.nextInt();
		}
		
		//Almacenamos el valor de 0 en tmp
		tmp = enteros[9];	//Almacenamos el valor de [9] para que no se pierda 
		
		//Cambiar los valores de posicion
		for(i = 9; i >= 0; i--) {
			if(i != 0) {
				enteros[i] = enteros[i - 1];
			}else {
				enteros[0] = tmp;
			}
		}
		
		//Mostramos el array para comprobar si funciona
		for(i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}

	}

}
