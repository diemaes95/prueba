import java.util.Scanner;

public class vec16 {
	
	// Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un
	// centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide
	// leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos
	// mostrar al final: la nota media del grupo en cada trimestre, y la media del
	// alumno que se encuentra en la posición N (N se lee por teclado). 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TOPE = 5;
		int[] vector1, vector2, vector3;
		double media1 = 0, media2 = 0, media3 = 0;
		int alumno;
		double mediaAlumno = 0;
		
		vector1 = new int [TOPE];
		vector2 = new int [TOPE];
		vector3 = new int [TOPE];
		
		// Llena los vectores
		System.out.println("Introduzca las notas del primer trimestre: \n");
		for(int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + " ---> ");
			vector1[i] = entrada.nextInt();
			media1 += vector1[i];
		}
		
		System.out.println("Introduzca las notas del segundo trimestre: \n");
		for(int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + " ---> ");
			vector2[i] = entrada.nextInt();
			media2 += vector2[i];
		}
		
		System.out.println("Introduzca las notas del tercer trimestre: \n");
		for(int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + " ---> ");
			vector3[i] = entrada.nextInt();
			media3 += vector3[i];
		}
		
		// Calcula la media de alumno N
		System.out.println("De que alumno desea obtener la media? \n");
		alumno = entrada.nextInt();
		
		mediaAlumno = vector1[alumno] + vector2[alumno] + vector3[alumno];
		
		// Salida
		System.out.println("La media del primer trimestre es: " + media1/5);
		System.out.println("La media del segundo trimestre es: " + media2/5);
		System.out.println("La media del tercer trimestre es: " + media3/5);
		
		System.out.println("La media de alumno " + alumno + " es: " + mediaAlumno/3);
	}
}