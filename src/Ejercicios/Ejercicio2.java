package Ejercicios;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escaner
		Scanner entrada=new Scanner(System.in);
		
		//declaración de variables
		int x;
		int[] arrayA;
		arrayA= new int[5];
		
		//For para introducir los 5 números
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un número:");
			x=entrada.nextInt();
			arrayA[i]=x;
		}
		
		//For para mostrar los números de forma inversa
		for(int y=4;y>=0;y--) {
			System.out.println(arrayA[y]);
		}
	}

}
