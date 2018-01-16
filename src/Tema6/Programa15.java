package Tema6;
import java.util.*;
public class Programa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int[] vector1;
		vector1 = new int[10];
		
		int n;							
		boolean hecho = false;
		
		System.out.println("Introduzca un valor para el vector1: \n");
		for(int i = 0; i < 10; i++) {							
			vector1[i] = entrada.nextInt();
			System.out.println("Valor Introducido");
		}
		
		System.out.println("Introduzca el valor a localizar");		
		n = entrada.nextInt();
		
		for(int i = 0; i<10; i++) {				
			if(vector1[i] == n) {
				System.out.println("Su valor se halla en la posición "+i);
				hecho = true;			
			}
			
			if(i==9 && hecho == false)		
				System.out.println("El valor no ha sido encontrado");
		}
	}

}