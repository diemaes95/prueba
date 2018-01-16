package Tema6;
import java.util.*;
public class Programa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		int[] vector1;
		vector1 = new int[10];
		
		int indice;
		
		System.out.println("Introduzca los valores para el vector1\n");
		for (int i=0; i<8;i++) {
			
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
		}	
	
		System.out.println("Introduzca un valor para el indice");
		indice = entrada.nextInt();
		
		for (int i=9; i>indice;i--) {
			vector1[i] = vector1[i-1];
		}
		
		System.out.println("Introduzca un valor");
		vector1[indice] = entrada.nextInt();
		
		System.out.println("Vector1: \n");
		for (int i=0; i<10;i++) {
			System.out.println(vector1[i]);
		}
	}
}
