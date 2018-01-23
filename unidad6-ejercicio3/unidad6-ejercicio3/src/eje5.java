//busqueda binaria
import java.util.*;
public class eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int vector[]=new int[10];
		int aux;
		int inicio=0,fin=9,pos,donde=0,elementobuscar;
		boolean encontrado=false;
		
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
        
        System.out.println("\nnumero a buscar");
        elementobuscar=entrada.nextInt();
        
        while(inicio<=fin) {
        	pos=(inicio+fin)/2;
        	if(elementobuscar==vector[pos]) {
        		encontrado=true;
        		donde=pos;	
        	}
        	if(elementobuscar>vector[pos]) {
        		inicio=pos+1;
        	}else {
        		fin=pos-1;
        	}
        }
        if(encontrado==true) {
        	System.out.println("encontrado "+donde);
        }else
        	System.out.println("no encontrado");

	}

}
