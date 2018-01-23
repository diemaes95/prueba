//Leer 5 números por teclado y a continuación realizar la media de los números 
//positivos, la media de los negativos y contar el número de ceros. 
import java.util.*;
public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		//variables
		int pos=0,neg=0,sumapos=0,sumaneg=0,ceros=0;
		
		int[]numeros=new int[5];
		
		for(int i=0;i<numeros.length;i++) {//rellenamos el array de datos
			System.out.println("introducir numero");
			numeros[i]=entrada.nextInt();
		}
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>0) {//comprobamos que sean positivos
				sumapos+=numeros[i];
				pos++;	
			}else if(numeros[i]<0) {//comprobamos que sean negativos
				sumaneg+=numeros[i];
				neg++;	
			}else
				ceros++;		
		}
		
		//mostramos resultados
		System.out.println("numero de ceros:"+ceros);
		if(pos!=0) {
		System.out.println("media positivos"+sumapos/pos);
		}else
			System.out.println("no hay positivos");
		if(neg!=0) {
		System.out.println("media negativos"+sumaneg/neg);
		}else
			System.out.println("no hay negativos");

	}

}
