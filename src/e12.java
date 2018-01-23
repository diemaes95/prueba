//2. Leer por teclado un array de 10 números enteros y leer una posición (entre 0 y
//9). Eliminar el elemento situado en la posición dada sin dejar huecos. 
import java.util.*;
public class e12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int posicion;
		int numeros[]=new int[10];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("introduce numero");
			numeros[i]=entrada.nextInt();
		}
		
		System.out.println("introduce posicion a eliminar");
		posicion=entrada.nextInt();//introduce posision
		
		//desplazamos posicion
		for(int i=posicion;i<9;i++) {
			numeros[i]=numeros[i+1];
		}
		
		//resultado
		for(int i=0;i<9;i++) {
			System.out.println(numeros[i]);
		}

	}

}
