import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada= new Scanner(System.in);
	
	//Declaramos una variable para el contador y otra para asignar valores al vector
	
	int n;
	int[] vector1;
	vector1= new int[5];
	
	for(n=0; n<5; n++) {
		System.out.println("Introduzca un valor");
		vector1[n]=entrada.nextInt();	
	}
	
	System.out.println("\nVector 1:");
	for(n=0; n<5; n++) {
	System.out.println(vector1[n]);
	}
	}

}
