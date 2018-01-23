import java.util.Scanner;

public class MainNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Numero objetoA = new Numero();
		Numero objetoB = new Numero(8);
		Numero objetoC = new Numero();

		objetoA.setNumero(5);
		int opcion;

		do {
			System.out.println("\nIntroduzca opcion:\r\n" + "1. Crear un nuevo objeto.\r\n"
					+ "2. Modificar el objetoB.\r\n" + "3. Es cero.\r\n" + "4. Es par.\r\n" + "5. Es positivo.\r\n"
					+ "6. Es menor.\r\n" + "7. Es igual.\r\n" + "8. El menor.\r\n" + "9. El mayor.\r\n"
					+ "10. Suma.\r\n" + "11. Resta.\r\n" + "12. Salir. \n");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1: // Crear un nuevo objeto

				int numeroC;

				System.out.println("\nIntroduzca nuevo numero: ");
				numeroC = entrada.nextInt();

				objetoC = new Numero(numeroC);

				System.out.println("Ha creado objetoC: " + numeroC);

				break;

			case 2: // Modificar el objetoB

				int numeroB = objetoB.getNumero();

				System.out.println("\nEl objetoB es: " + numeroB);

				System.out.println("Introduzca el nuevo objetoB: ");
				numeroB = entrada.nextInt();

				System.out.println("El objetoB ahora es: " + numeroB);

				break;

			case 3: // Es cero

				if (objetoA.esCero()) {
					System.out.println("\nEl objetoA es 0");
				} else {
					System.out.println("El objetoA no es cero");
				}

				int numeroA = objetoA.getNumero();

				System.out.println("El objetoA es: " + numeroA);

				break;

			case 4: // Es par

				if (objetoA.esPar()) {
					System.out.println("\nEl objetoB es par");
				} else {
					System.out.println("El objetoB es impar");
				}

				numeroB = objetoA.getNumero();

				System.out.println("El objetoB es: " + numeroB);

				break;

			case 5: // Es positivo

				if (objetoC.esPositivo()) {
					System.out.println("\nEl objetoC es positivo");
				} else {
					System.out.println("El objetoC es negativo");
				}

				numeroC = objetoC.getNumero();

				System.out.println("El objetoB es: " + numeroC);

				break;

			case 6: // Es menor

				boolean es_menor = objetoA.esMenor(objetoC);

				if (es_menor) {
					System.out.println("\nEl objetoA es mayor");
				} else {
					System.out.println("\nEl objetoC es mayor");
				}

				System.out.println("El objetoA es: " + objetoA.getNumero());
				System.out.println("El objetoC es: " + objetoC.getNumero());

				break;

			case 7: // Es igual

				if (objetoC.esIgual(objetoB)) {
					System.out.println("\nLos objetos son iguales");
				} else {
					System.out.println("\nLos objetos no son iguales");
				}

				System.out.println("El objetoC es: " + objetoC.getNumero());
				System.out.println("El objetoB es: " + objetoB.getNumero());

				break;

			case 8: // El menor

				System.out.println("El objetoA es: " + objetoA.getNumero());
				System.out.println("El objetoB es: " + objetoB.getNumero());

				Numero objetoMenor = objetoA.elMenor(objetoB);

				System.out.println("\nEl objeto menor es: " + objetoMenor.getNumero());

				break;

			case 9: // El mayor

				System.out.println("El objetoB es: " + objetoB.getNumero());
				System.out.println("El objetoC es: " + objetoC.getNumero());

				Numero objetoMayor = objetoB.elMayor(objetoC);

				System.out.println("\nEl objeto mayor es: " + objetoMayor.getNumero());

				break;

			case 10: // Suma

				System.out.println("El objetoC es: " + objetoC.getNumero());
				System.out.println("El objetoA es: " + objetoA.getNumero());

				Numero objetoSuma = objetoC.suma(objetoA);

				System.out.println("\nLa suma de los objetos es: " + objetoSuma.getNumero());

				break;

			case 11: // Resta

				System.out.println("El objetoC es: " + objetoC.getNumero());
				System.out.println("El objetoB es: " + objetoB.getNumero());

				Numero objetoResta = objetoC.resta(objetoB);

				System.out.println("\nLa resta de los objetos es: " + objetoResta.getNumero());

				break;

			case 12: // Salir

				System.out.println("Salir");

				break;

			default: // Error

				System.out.println("Error");

				break;

			}

		} while (opcion != 12);
	}
}
