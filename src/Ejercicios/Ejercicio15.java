package Ejercicios;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		//variables
		int x;
		int tmp;
		int[] arrayA;
		arrayA = new int[10];

		// For para pedir números
		for (int i = 0; i < 5; i++) {
			System.out.println("arrayA[" + i + "](Orden Creciente):");
			x = entrada.nextInt();
			arrayA[i] = x;
		}
		
		// pedimos el número N
		System.out.println("¿Que numero quieres buscar?:");
		x = entrada.nextInt();
		
		//for para buscar N
		for(int y=0;y<10;y++) {
			if(arrayA[y]==x) {
				System.out.println(x + " está en la posición " + y);
				mostrad0=true
			}
		}
	}

}
