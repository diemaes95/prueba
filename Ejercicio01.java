import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int n, m, aux;
		int[] vector;
		vector= new int[10];
		
		for(n=0; n<10; n++) {
			System.out.println("Introduzca un valor");
			vector[n]=entrada.nextInt();	
		}
		
		for(n=0; n<vector.length-1; n++) {
			for(m=0; m<vector.length-n-1; m++) {
				if(vector[m+1]<vector[m]) {
					aux=vector[m+1];
					vector[m+1]=vector[m];
					vector[m]=aux;
				}
			}
		}
		
		System.out.println("\nVector 1:");
		for(n=0; n<10; n++) {
		System.out.println(vector[n]);
		}
	}

}
