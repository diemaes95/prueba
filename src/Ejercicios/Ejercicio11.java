package Ejercicios;
import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		// variables
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
		System.out.println("arrayA[N]:");
		x = entrada.nextInt();
		
		//Comprobamos donde deberia ir;
		for(int y=0;y<9;y++) {
			if(arrayA[y]<x) {
				if(arrayA[y+1]>x) {
					for(int z=8;z>=y;z--) {//Este for moverá las posiciones correspondientes
						arrayA[z+1]=arrayA[z];
					}
					arrayA[y+1]=x;
				}
			}
		}
		
		//Mostrar
		for (int m = 0; m < 10; m++) {
			System.out.println("arrayA[" + m + "]: " + arrayA[m]);
		}
	}
}
