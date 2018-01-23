//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un
//centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide
//leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos
//mostrar al final: la nota media del grupo en cada trimestre, y la media del
//alumno que se encuentra en la posición N (N se lee por teclado).
import java.util.*;
public class e16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int primer[],segundo[],tercero[];
		int num,i;
		double media;
		int sumaprimer,sumasegundo,sumatercero;
		
		primer=new int[5];
		segundo=new int[5];
		tercero=new int[5];
		
		System.out.println("Introduce nota del trimestre:");
		for(i=0;i<5;i++) {
			System.out.println("Alumno ("+i+"):");
			primer[i]=entrada.nextInt();
		}
		
		System.out.println("Introduce nota del segundo trimestre:");
		for(i=0;i<5;i++) {
			System.out.println("Alumno ("+i+"):");
			segundo[i]=entrada.nextInt();
		}
		
		System.out.println("Introduce nota del tercer trimestre:");
		for(i=0;i<5;i++) {
			System.out.println("Alumno ("+i+"):");
			tercero[i]=entrada.nextInt();
		}
		
		sumaprimer=0;
		sumasegundo=0;
		sumatercero=0;
		
		for (i =0; i < 5; i++) {
		 sumaprimer += primer[i];
		 sumasegundo += segundo[i];
		 sumatercero += tercero[i];
		 }
		 // mostramos datos
		 System.out.println("Media primer trimestre: "+ sumaprimer/5.0);
		 System.out.println("Media segundo trimestre: "+ sumasegundo/5.0);
		 System.out.println("Media tercer trimestre: "+ sumatercero/5.0);

		do {
		 System.out.print ("Introduzca posición del alumno (de 0 a 4): ");
		 num=entrada.nextInt();
		} while(num>4);
		 media =(primer[num]+segundo[num]+tercero[num])/3;
		 
		 System.out.println("La media del alumno es: " + media);
		 

		 
	}
}

