//Leer 10 enteros. Guardar en otro array los elementos pares de la primera, y a
//continuación los elementos impares. Realizar dos versiones: una trabajando
//con los valores y otra trabajando con los índices. 
import java.util.*;
public class e13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int num[];
		int contpar,pares[];
		int contimp,impares[];
		
		num=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("introducir numero");
			num[i]=entrada.nextInt();
		}
		
		contpar=0;
		contimp=0;
		
		for(int i=0;i<10;i++) {
			if(num[i]%2==0) {
				contpar++;
			}else
			contimp++;
		}
		
		//creamos tablas pares e impares
		
			pares=new int[contpar];
			impares=new int[contimp];	
			System.out.println(+contpar+","+contimp);
		
		
		contpar=0;
		contimp=0;
		
		for(int i=0;i<10;i++) {
			if(num[i]%2==0) {
				pares[contpar]=num[i];
				contpar++;
			}else {
				impares[contimp]=num[i];
				contimp++;
			}
		}
		
		
		if(contpar>0) {
			System.out.println("tabla pares");
			for(int i=0;i<contpar;i++) {
			System.out.println(pares[i]);
			}
		}else {System.out.println("no hay pares");
		}
		
		if(contimp>0) {
			System.out.println("tabla impares");
			for(int i=0;i<contimp;i++) {
			System.out.println(impares[i]);
			}
		}else {System.out.println("no hay impares");
		}
		

	}

}
