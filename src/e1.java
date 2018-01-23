//Leer 5 números y mostrarlos en el mismo orden introducido
import java.util.*;
public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int[] numeros=new int[5]; 
		
		for(int i=0;i<numeros.length;i++) {//rellenamos el array de datos
			System.out.println("introduce numero");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("los numeros son:");//salida array
		for(int i=0;i<5;i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("Programa hecho por Juanra");
	}

}

//fin