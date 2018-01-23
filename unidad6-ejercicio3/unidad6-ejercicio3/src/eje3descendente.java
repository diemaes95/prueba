import java.util.Scanner;

public class eje3descendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada=new Scanner(System.in);
		
		int vector[]=new int[10];
		int aux,menor,posicion;
		
		System.out.println("Ingrese los números.");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print("["+i+"]"+"=");
                  vector[i]=entrada.nextInt(); 
        }
        
        for(int i=0;i<10-2;i++) {
        	menor=vector[i];
        	posicion=i;
        	for(int j=i+1;j<10;j++) {
        		if(vector[j]>menor) {
        			menor=vector[j];
        			posicion=j;
        		}
        	}
        	if(posicion!=i) {
            	aux=vector[i];
            	vector[i]=vector[posicion];
            	vector[posicion]=aux;
            }
        }
        
        System.out.println("numeros ordenados");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print(vector[i]);        
        }
        
        
	}

}
