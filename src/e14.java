//Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar
//(fusionar) las dos tablas en una tercera, de forma que sigan ordenados. 
import java.util.*;
public class e14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int a[], b[], c[];
		int i,j,k;
		a =new int[10];
		b =new int[10];
		
		System.out.println("Datos para a:");
		for (i=0;i<10;i++){
		System.out.print("Introduzca numero (orden creciente): ");
		a[i]=entrada.nextInt();
		}
		
		System.out.println("\nDatos para b:");
		for (i=0;i<10;i++){
		System.out.print("Introduzca numero (orden creciente): ");
		b[i]=entrada.nextInt();
		}
		
		
		c = new int [20];
		
		i=0;
		j=0; 
		k=0; 
		while(i<10 && j<10){
			if (a[i] < b[j]){
			c[k] = a[i];
			i++; // incrementamos i para tomar el siguiente elemento de a
			}else{
			c[k] = b[j];
			j++; // incrementamos j para tomar el siguiente elemento de b
			}
			k++; //  incrementamos k para que en la siguiente vuelta, utilizar el siguiente hueco de la tabla
		}
		//salimos por que alguna de las tablas (a o b) ha llegado al final
		if(i==10) { // hemos copiado toda la tabla a en c, queda por copiar un resto de b
			while (j<10){
			c[k] = b[j];
			j++;
			k++;
			}
		}else // hay que copiar el resto de a en c
		while (i<10){
		c[k] = a[i];
		i++;
		k++;
		}
		
		
		System.out.println("Mostramos la tabla c:");
		for (k=0;k<20;k++)
		System.out.print(c[k] + " ");

	}
	
}
