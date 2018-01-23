//Leer los datos correspondientes a dos arrays de 12 elementos enteros, y
//mezclarlos en un tercer array de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
import java.util.*;
public class e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int[] a=new int[12];
		int[] b=new int[12];
		int[] c=new int[24];
		
		System.out.println("tabla a");
		for(int i=0;i<a.length;i++) {//rellenamos el array de datos
			System.out.println("introducir numero");
			a[i]=entrada.nextInt();
		}
		
		System.out.println("tabla b");
		for(int i=0;i<b.length;i++) {//rellenamos el array de datos
		b[i]=entrada.nextInt();
		}
		
		int j=0;//utilizara para tabla c
		for(int i=0;i<12;i+=3) {//copiamos de 3 en 3 datos del array A y B al C
			c[j]=a[i];
			j++;
			c[j]=a[i+1];
			j++;
			c[j]=a[i+2];
			j++;
			c[j]=b[i];
			j++;
			c[j]=b[i+1];
			j++;
			c[j]=b[i+2];
			j++;
		}
		
		System.out.println("tabla c: ");
		for(int i=0;i<24;i++) {
			System.out.println(c[i]);
		}
		
		
	}

}
