//Leer por teclado una serie de 10 números enteros. La aplicación debe
//indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados. 
import java.util.*;
public class e7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		boolean creciente=false,decreciente=false;
		
		int[] numeros=new int[10];
		
		System.out.println("tabla de numeros");
		for(int i=0;i<10;i++) {//rellenamos el array de datos
			System.out.println("introducir numero");
			numeros[i]=entrada.nextInt();
		}
		
		for(int i=0;i<9;i++) {
			if(numeros[i] < numeros[i+1]) {//comprueba que sea creciente 1-2-3-4.5...
				creciente=true;
			}
			if(numeros[i] > numeros[i+1]) {//comprueba que sea decreciente 5-4-3-2-1...
				decreciente=true;
			}
		}
		
		if(creciente==true && decreciente==false) {
			System.out.println("tabla esta en forma creciente");
		}else
			if(creciente==false && decreciente==true){
			System.out.println("tabla esta en forma decreciente");
		}else
			if(creciente==true && decreciente==true) {
			System.out.println("tabla esta desordenada");
		}else
			if(creciente==false && decreciente==false) {
			System.out.println("numeros tabla son iguales");
		}
		
		

	}

}
