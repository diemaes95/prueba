package Ejercicios;

/*
 * Queremos desarrollar una aplicación que nos ayude a gestionar
 * las notas de un centro educativo. Cada grupo (o clase) está
 * compuesto por 5 alumnos. Se pide leer las notas del primer, 
 * segundo y tercer trimestre de un grupo. Debemos mostrar al 
 * final: la nota media del grupo en cada trimestre, y la media 
 * del alumno que se encuentra en la posición N (N se lee por teclado).
 */
import java.util.*;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Se hara suponiendo que solo hay 1 nota por trimestre

		// Declaracion de variables
		int i, suma = 0, div = 0, ciclo = 0, menu;
		double media;
		int[] primerTrimestre;
		int[] segundoTrimestre;
		int[] tercerTrimestre;
		primerTrimestre = new int[5];
		segundoTrimestre = new int[5];
		tercerTrimestre = new int[5];

		// Notas primer trimestre
		System.out.println("Notas primer trimestre:");
		for (i = 0; i < primerTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " + (i + 1));
			primerTrimestre[i] = entrada.nextInt();
		}

		// Notas segundo trimestre
		System.out.println("\n" + "Notas Segundo trimestre:");
		for (i = 0; i < segundoTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " + (i + 1));
			segundoTrimestre[i] = entrada.nextInt();
		}

		// Notas tercer trimestre
		System.out.println("\n" + "Notas Tercer trimestre:");
		for (i = 0; i < tercerTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " + (i + 1));
			tercerTrimestre[i] = entrada.nextInt();
		}

		// Switch de la aplicacion
		do {
			
			System.out.println("Para mostrar la media del aulumno 1 pulse 1.");
			System.out.println("Para mostrar la media del aulumno 2 pulse 2.");
			System.out.println("Para mostrar la media del aulumno 3 pulse 3.");
			System.out.println("Para mostrar la media del aulumno 4 pulse 4.");
			System.out.println("Para mostrar la media del aulumno 5 pulse 5.");
			System.out.println("Para mostrar del grupo pulse 6.");
			System.out.println("Para salir pulse 7.");
			menu = entrada.nextInt();
			
			switch (menu) {
				case 1:
					suma = 0;
					suma = suma + primerTrimestre[menu - 1] + segundoTrimestre[menu - 1] + tercerTrimestre[menu - 1];
					div = 3;
					media = suma / div;
	
					System.out.println("La media del alumno " + menu + " es " + media+"\n");
					break;
	
				case 2:
					suma = 0;
					suma = suma + primerTrimestre[menu - 1] + segundoTrimestre[menu - 1] + tercerTrimestre[menu - 1];
					div = 3;
					media = suma / div;
	
					System.out.println("La media del alumno " + menu + " es " + media+"\n");
					break;
	
				case 3:
					suma = 0;
					suma = suma + primerTrimestre[menu - 1] + segundoTrimestre[menu - 1] + tercerTrimestre[menu - 1];
					div = 3;
					media = suma / div;
	
					System.out.println("La media del alumno " + menu + " es " + media+"\n");
					break;
	
				case 4:
					suma = 0;
					suma = suma + primerTrimestre[menu - 1] + segundoTrimestre[menu - 1] + tercerTrimestre[menu - 1];
					div = 3;
					media = suma / div;
	
					System.out.println("La media del alumno " + menu + " es " + media+"\n");
					break;
	
				case 5:
					suma = 0;
					suma = suma + primerTrimestre[menu - 1] + segundoTrimestre[menu - 1] + tercerTrimestre[menu - 1];
					div = 3;
					media = suma / div;
	
					System.out.println("La media del alumno " + menu + " es " + media+"\n");
					break;
	
				case 6:
					suma = 0;
					div = 0;
	
					// Media del grupo
					for (i = 0; i < 5; i++) {
						suma = suma + primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i];
						div = div + 3;
					}
	
					// Mostramos la media del grupo
					media = suma / div;
					System.out.println("La media del grupo es " + media+"\n");
					break;
	
				case 7:
					System.out.println("La aplicacion a finalizado."+"\n");
					break;
	
				default:
					System.out.println("No ha introducido correctamente la opcion."+"\n");
					break;

			}
		} while (menu != 7);
	}

}
