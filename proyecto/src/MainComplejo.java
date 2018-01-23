import java.util.Scanner;

public class MainComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Complejo numA = new Complejo(1, 2);
		Complejo numB = new Complejo(0, 3);
		int opcion;

		do {
			System.out.println("Introduzca opcion: \n1: Suma \n2: Resta \n3: Multiplicacion"
					+ " \n4: Division \n5: Salir \n");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:  //Suma

				Complejo num1 = numA.sumar(numB);

				double real1 = num1.getParteReal();
				double imag1 = num1.getParteImaginaria();

				System.out.println(real1 + "," + imag1 + "\n");

				break;
				
			case 2:  //Resta

				Complejo num2 = numA.restar(numB);

				double real2 = num2.getParteReal();
				double imag2 = num2.getParteImaginaria();

				System.out.println(real2 + "," + imag2 + "\n");

				break;
				
			case 3:  //Multiplicacion

				Complejo num3 = numA.multiplicar(numB);

				double real3 = num3.getParteReal();
				double imag3 = num3.getParteImaginaria();

				System.out.println(real3 + "," + imag3 + "\n");

				break;
				
			case 4:  //Division

				Complejo num4 = numA.dividir(numB);

				double real4 = num4.getParteReal();
				double imag4 = num4.getParteImaginaria();

				System.out.println(real4 + "," + imag4+ "\n");

				break;
				
			case 5:  //Salida
				
				System.out.println("Salir");
				
				break;
			
			default:  //Error
				
				System.out.println("Error");
				
				break;
				
			}
			
		} while (opcion != 5);
	}
}
