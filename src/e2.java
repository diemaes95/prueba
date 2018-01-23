//Leer 5 números y mostrarlos en orden inverso al introducido
import java.util.*;
public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int[5];
		
		for(int i=0;i<numeros.length;i++) {//rellenamos el array de datos
			System.out.println("introducir numeros");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("los numeros son:");
		for (int i=4;i>=0;i--) {
			System.out.println(numeros[i]);
		}

	}

}
