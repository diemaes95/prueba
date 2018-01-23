//Ídem, desplazar N posiciones (N es introducido por el usuario). 
import java.util.*;
public class e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int[10];
		int ultimo;
		int n;
		
		for(int i=0;i<10;i++) {
			System.out.println("introduce numero");
			numeros[i]=entrada.nextInt();
		}
	
		System.out.println("posiciones a desplazar: ");
		n=entrada.nextInt();
		
			for(int vueltas=1;vueltas<n;vueltas++) {
			ultimo=numeros[9];
			
				for(int i=8;i>=0;i--) {//desplazamientos hacia abajo
				numeros[i+1]=numeros[i];
				}
				numeros[0]=ultimo;//el ultimo valor pasa a ser el primero.
			}
			
			System.out.println("tabla queda:");
			for(int i=0;i<10;i++) {
				System.out.println(numeros[i]);
			}
		
			
	}

}
