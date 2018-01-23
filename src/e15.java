//Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en el array. Se
//debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje. 
import java.util.*;
public class e15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int a[],numero;
		boolean creciente=true;
		
		a=new int[10];
		System.out.println("rellenamos a");
		do {
			for(int i=0;i<10;i++) {
				System.out.println("introduce numero");
				a[i]=entrada.nextInt();
			}
			for(int i=0;i<9;i++) {
				if(a[i] < a[i+1]) {
					creciente=true;
				}
				if(a[i] > a[i+1]) {
					creciente=false;
					break;
				}
			}
			
			if(creciente==false) {
				System.out.println("no esta introducido forma creciente");
			}
		}while(creciente == false);
		
		System.out.println("numero a buscar");
		numero=entrada.nextInt();
		
		int i=0;
		
		while(i<10 && a[i]<numero) {
			i++;
		}
		
		if(i==10) {
			System.out.println("numero no encontrado");
		}else {
			if(a[i]==numero){
				System.out.println("numero encontrado en la posicion: "+i);
			}else {
				System.out.println("");
			}
		}

	}

}
