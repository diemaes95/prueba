package unidad5_ejercicios2;

import java.util.Scanner;

public class Testfecha {

	public static void main(String[] args) {
		// declaramos variables
		Scanner entrada=new Scanner(System.in);
		int d, m=0, a;
		//se pide por teclado el dia mes y año
		System.out.println("introduce fecha");
		System.out.println(" dia");
		d=entrada.nextInt();
		System.out.println(" mes");
		m=entrada.nextInt();
		System.out.println(" año");
		a=entrada.nextInt();
		//se crea un objeto fecha usando un constructor con parametros
		
		Fecha fecha = new Fecha(d, m, a);
		if(fecha.fechacorrecta()) {//si la fecha es correcta
			//se muestra utilizando el tostring
			System.out.println("Fecha introducida:"+fecha);
			 //se muestran los diez dias siguientes utilizando el metodo diasiguiente.
			System.out.println("los 10 dias siguientes son");
			for(int i=1;i<=10;i++) {
				fecha.diaSiguiente();
				System.out.println(fecha);
				
				
			}
			
		}else {//si la fecha es incorrrecta
			System.out.println("fecha no valida");
		}

	}

}
