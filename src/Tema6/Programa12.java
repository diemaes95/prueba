package Tema6;
import java.util.*;
public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[] vector1;
		vector1 = new int[10];

		for (int i = 0; i < 10; i++) {
			vector1[i] = i + 1;
		}

		System.out.println("Introduzca la posicion que quiera eliminar");
		int n = entrada.nextInt();

		for (int i = n; i < 9; i++) {			
			vector1[i] = vector1[i + 1];		
		}
		vector1[9] = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(vector1[i]);
		}
	}

}

