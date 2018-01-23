//. Leer 5 elementos enteros que se introducirán ordenados de forma creciente.
//Éstos los guardaremos en un array de tamaño 10. Leer un número N, e
//insertarlo en el lugar adecuado para que el array continúe ordenado. 
import java.util.*;
public class e11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int[10];
		boolean creciente=true;
		int numero,sitionumero=0,j=0;
		
		do {
			for(int i=0;i<5;i++) {
				System.out.println("introduce numero");
				numeros[i]=entrada.nextInt();
			}
			
			for(int i=0;i<4;i++) {
				if(numeros[i] < numeros[i+1]) {
					creciente=true;
				}
				if(numeros[i] > numeros[i+1]) {
					creciente=false;
					break;
				}
			}
			
				if(creciente==false) {
					System.out.println("no esta introducido forma creciente");
				}
				
			
		}while(creciente==false);
		
		System.out.println("introduce numero");
		numero=entrada.nextInt();
		
		//saber en que posicion va
		while(numeros[j]<numero && j<5) {
			sitionumero++;
			j++;
		}
		//movemos una posicion
		for(int i=4;i>=sitionumero;i--) {
			numeros[i+1]=numeros[i];
		}
		
		numeros[sitionumero]=numero;//insertamos numero posicion que va
		
		//resultado
		for(int i=0;i<6;i++) {
			System.out.println(numeros[i]);
		}
		
		

	}

}
 