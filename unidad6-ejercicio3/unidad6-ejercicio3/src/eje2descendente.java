import java.util.Scanner;

public class eje2descendente {

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
        
        for(int i=0;i<10-1;i++) {
        	aux=vector[i];
        	int j=i-1;
        	while(j>=0 && vector[j]<aux){
        		vector[j+1]=vector[j];
        		vector[j]=aux;
        		j--;
        	}
        }
        
        System.out.println("numeros ordenados");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print(vector[i]);
                  
        }


	}

}
