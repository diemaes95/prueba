package Tema6;
import java.util.*;
public class Programa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		boolean creciente = false;
		boolean decreciente = false;
		
		int n;
		
		int[] vector1;
		vector1 = new int[10];
		
		System.out.println("Introduzca los valores para el vector1\n");
		for (int i=0; i<10;i++) {
			
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido\n");
			
		}
		
		for (int i=0; i<9; i++) {
			if (vector1[i] < vector1[i+1]) {
				creciente = true;
			}else {
				if (vector1[i] > vector1[i+1]) {
					decreciente = true;
				}
			}
		}
		
		if (creciente == false && decreciente == false) {
			System.out.println("Los numeros son iguales");
		}else {
			if (creciente == true && decreciente == false) {
				System.out.println("Esta ordenado en orden creciente");
			}else {
				if (creciente == false && decreciente == true) {
					System.out.println("Esta ordenado en orden decreciente");
				}else {
					if (creciente == true && decreciente == true) {
						System.out.println("Los numeros estan desordenados");
					}
				}
			}
		}
	}

}
