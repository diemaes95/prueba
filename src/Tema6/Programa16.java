package Tema6;
import java.util.*;
public class Programa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		double mediatotal = 0;
		double media1t = 0;
		double media2t = 0;
		double media3t = 0;					

		int[] primerTrimestre;
		primerTrimestre = new int[5];

		int[] segundoTrimestre;					
		segundoTrimestre = new int[5];

		int[] tercerTrimestre;
		tercerTrimestre = new int[5];

		System.out.println("Introduzca valores para el vector primerTrimestre");
		for (int i = 0; i < 5; i++) {												
			primerTrimestre[i] = entrada.nextInt();
		}
		
		System.out.println("Intruduzca valores para el vector segundoTrimestre");
		for (int i = 0; i < 5; i++) {
			segundoTrimestre[i] = entrada.nextInt();
		}

		System.out.println("Introduzca valores para el vector tercerTrimestre");
		for (int i = 0; i < 5; i++) {
			tercerTrimestre[i] = entrada.nextInt();
		}

																
		for (int i = 0; i < 5; i++) {
			media1t= primerTrimestre[i] + media1t;
		}
																	
		for (int i = 0; i < 5; i++) {
			media2t = segundoTrimestre[i] + media2t;
		}
																	
		for (int i = 0 ; i<5; i++) {
			media3t = tercerTrimestre[i] + media3t;
		}
		
		System.out.println("Introduzca la posicion del alumno del que desea conocer la media");
		int n = entrada.nextInt();
		
		mediatotal = primerTrimestre[n]+segundoTrimestre[n]+tercerTrimestre[n];		
		mediatotal = mediatotal / 3;							
		
		media1t = media1t / 5;	
		
		media2t = media2t / 5;		
		
		media3t = media3t / 5;		
		
		System.out.println("Primer Trimestre: "+media1t+", Segundo Trimestre: "+media2t+", Tercer Trimestre: "
				+ media3t+" Media Total: "+mediatotal);
		
	}

}

