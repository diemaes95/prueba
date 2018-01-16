package Ejercicios;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escaner
		Scanner entrada=new Scanner(System.in);
		
		//Variables
		int x;
		int contadorA=0;
		int contadorB=0;
		int[] arrayA;
		int[] arrayB;
		int[] arrayC;
		arrayA=new int[10];
		arrayB=new int[10];
		arrayC=new int[20];
		
		//For para pedir los valores
		for(int i=0;i<10;i++) {
			System.out.println("arrayA[" + i + "]: ");
			x=entrada.nextInt();
			arrayA[i]=x;
			
			System.out.println("arrayB[" + i + "]: ");
			x=entrada.nextInt();
			arrayB[i]=x;
		}
		
		//For para recolocar A y B en C y muestra C.
		for(int c=0;c<20;c++) {
			
			if((c==0)||(c%2==0)){
				arrayC[c]=arrayA[contadorA];
				contadorA+=1;
			}else {
				arrayC[c]=arrayB[contadorB];
				contadorB+=1;
			}
			
			System.out.println("arrayC[" + c + "]: " + arrayC[c]);
		}
	}

}
