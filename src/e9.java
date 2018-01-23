//Crear un programa que lea por teclado un array de 10 números enteros y lo
//desplace una posición hacia abajo (el último pasa a ser el primero). 
import java.util.*;
public class e9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int[10];
		int ultimo;
		for(int i=0;i<numeros.length;i++) {
			System.out.println("introducir numero");
			numeros[i]=entrada.nextInt();
		}
		
		ultimo=numeros[9];
		
		for(int i=8;i>=0;i--) {
			numeros[i+1]=numeros[i];
		}
		
		numeros[0]=ultimo;
		
		System.out.println("nuevos resultados:");
		for(int i=0;i<10;i++) {
			System.out.println(numeros[i]);
		}

	}

}
