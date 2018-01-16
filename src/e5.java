//Leer por teclado dos arrays de 10 números enteros y mezclarlas en un tercero
//de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 
import java.util.*;
public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int[] a=new int[10];
		int[] b=new int[10];
		int[] c=new int[20];
		
		System.out.println("tabla a:");
		for(int i=0;i<a.length;i++) {//rellenamos el array de datos
			System.out.println("introducir numero");
			a[i]=entrada.nextInt();
		}
		System.out.println("tabla b:");
		for(int i=0;i<b.length;i++) {//rellenamos el array de datos
			System.out.println("introducir numero");
			b[i]=entrada.nextInt();
		}
		
		int j=0;//se utilizara para la tabla c
		for(int i=0;i<10;i++) {//copian datos al array C
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		
		System.out.println("tabla c:");
		for(int i=0;i<20;i++) {
			System.out.println(c[i]);
		}
		

	
	}
}
