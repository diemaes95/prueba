//Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el
//primero, el último, el segundo, el penúltimo, el tercero, etc. 
import java.util.*;
public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int[] numeros=new int[10];
		
		for(int i=0;i<numeros.length;i++) {//rellenamos el array de datos
			System.out.println("introduce numero: ");
			numeros[i]=entrada.nextInt();
		}
		
		System.out.println("resultado: ");//se muestran datos al inverso
		for(int i=0;i<=4;i++) {
			System.out.println(numeros[i]);
			System.out.println(numeros[9-i]);
			
		}

	}

}
