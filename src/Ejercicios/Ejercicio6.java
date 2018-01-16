package Ejercicios;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escaner
		Scanner entrada=new Scanner(System.in);
		
		//Variables
		int x;
		int contadorA=-1;
		int contadorB=-1;
		int[] arrayA;
		int[] arrayB;
		int[] arrayC;
		arrayA = new int[12];
		arrayB = new int[12];
		arrayC = new int[24];
		
		//for para pedir valores
		for(int i=0;i<12;i++){
			System.out.println("arrayA[" + i + "]:");
			x=entrada.nextInt();
			arrayA[i]=x;
			System.out.println("arrayB[" + i + "]:");
			x=entrada.nextInt();
			arrayB[i]=x;
		}
		
		//for para pasar A y B a C de 3 en 3.
		for(int y=-1;y<24;y+=3) {
			if((y==-1)||(y==5)||(y==11)||(y==17)) {
				arrayC[y+1]=arrayA[contadorA+=1];
				arrayC[y+2]=arrayA[contadorA+=1];
				arrayC[y+3]=arrayA[contadorA+=1];
			}else {
				arrayC[y+1]=arrayB[contadorB+=1];
				arrayC[y+2]=arrayB[contadorB+=1];
				arrayC[y+3]=arrayB[contadorB+=1];
			}
		}
		
		//for para mostrar C
		for(int c=0;c<24;c++) {
			System.out.println("arrayC[" + c + "]: " + arrayC[c]);
		}
		
		
	}

}