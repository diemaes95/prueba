package Ejercicios;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		//Declaramos variables
		int x;
		int[] arrayA;
		arrayA= new int[5];
		
		//For para introducir los 5 números
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un número:");
			x=entrada.nextInt();
			arrayA[i]=x;
		}
		
		//For para mostrar los 5 números
		for(int y=0;y<5;y++) {
			System.out.println(arrayA[y]);
		}
	}

}
