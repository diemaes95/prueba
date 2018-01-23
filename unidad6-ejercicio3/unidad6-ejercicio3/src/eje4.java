//busqueda lineal
import java.util.*;
public class eje4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int vector[]=new int[6];
		int pos=0;
		boolean encontrado=false;
		int elementobuscar;
		int j=0;
		
		
		System.out.println("numero a buscar");
        elementobuscar=entrada.nextInt();
		
		System.out.println("Ingrese los números.");
        for (int i = 0; i < vector.length; i++) {
                  System.out.print("["+i+"]"+"=");
                  vector[i]=entrada.nextInt();          
        }
        
        
        while(pos<6 && encontrado==false) {
      	  if(elementobuscar==vector[j]) {
      		  encontrado=true;
      	  }else {
      		  pos=pos+1;
      	  }j++;
        }
        if(encontrado==true) {
        	System.out.println("encontrado"+pos);
        }else
        	System.out.println("no encontrado");
        	
        
        
		
		

	}

}
