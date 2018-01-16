import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double a = 0;
		double b = 0;
		int opcion = 0;
		double resultado = 0;

		do {

			System.out.println("Introduzaca el primer valor: ");
			a = entrada.nextDouble();

			System.out.println("Introduzaca el segundo valor: ");
			b = entrada.nextDouble();

			System.out.println("\nEscoja una opción: ");
			System.out.println("	1.- Sumar");
			System.out.println("	2.- Restar");
			System.out.println("	3.- Multiplicar");
			System.out.println("	4.- Dividir");
			System.out.println("	5.- Salir");
			opcion = entrada.nextInt();

			switch (opcion) {

			// Sumar
			case 1:

				resultado = a + b;
				System.out.println("\nLa suma de " + a + " y " + b + " es = " + resultado + "\n");
				break;

			// Resta
			case 2:

				resultado = a - b;
				System.out.println("\nLa resta de " + a + " y " + b + " es = " + resultado + "\n");
				break;

			// Multiplcar
			case 3:

				resultado = a * b;
				System.out.println("\nLa multiplcacion de " + a + " y " + b + " es = " + resultado + "\n");
				break;

			// Dividir
			case 4:

				while (b == 0) {
					System.out.println("\nValor incorrecto, introduzca otro valor para el segundo número: ");
					b = entrada.nextDouble();
				}

				resultado = a / b;
				System.out.println("\nLa división de " + a + " y " + b + " es = " + resultado + "\n");
				break;

			// Salir
			case 5:
				
				System.out.println("\nADIÓS");
				break;

			default:

				System.out.println("Opción incorrecta\n");
				break;
			}

		} while (opcion != 5);

	}
}
