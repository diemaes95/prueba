//Lee y almacena de 10 elementos enteros en un array. Ordena el
//array usando el método de la burbuja. Muestra los valores antes y después de ordenar el array. 
import java.util.*;
public class eje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int vector[]=new int[10];
		int aux;
		
		System.out.println("Ingrese los números.");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print("["+i+"]"+"=");
                  vector[i]=entrada.nextInt(); 
        }
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9-i;j++) {
				if(vector[j+1]<vector[j]) {
					aux=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=aux;
				}
			}
		}
		
		
		System.out.println("numeros ordenados");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print(vector[i]);
                  
        }

	}

}
