package Ejercicios;
import java.util.*;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaracion de variables
		int i;
		
		//Array
		int [] lista = {1, 2, 3, 4, 5};
		
		for(i = 0;i < lista.length;i++) {
			System.out.println("Introduzca un numero:");
			lista[i] = entrada.nextInt();
		}
		
		//Bucle
		for(i=4;i>=0;i--) {
			System.out.println(lista[i]);
		}
		
	}

}
