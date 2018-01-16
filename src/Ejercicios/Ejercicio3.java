package Ejercicios;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escaner
		Scanner entrada = new Scanner(System.in);

		// Declaración de variables
		int x;
		int contCeros = 0;
		int contPos = 0;
		int contNeg = 0;
		double medPos = 0;
		double medNeg = 0;
		int[] arrayA;
		arrayA = new int[5];

		// For para pedir los 5 números
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime un número:");
			x = entrada.nextInt();
			arrayA[i] = x;
		}

		// For para contar positivos, negativos y ceros
		for (int m = 0; m < 5; m++) {
			if (arrayA[m] > 0) {
				contPos += 1;
				medPos += arrayA[m];
				System.out.println(medPos + ". " + contPos);
			} else if (arrayA[m] < 0) {
				contNeg += 1;
				medNeg += arrayA[m];
			} else
				contCeros += 1;
		}
		// Calculamos las medias
		if(contPos>0) {// If de seguridad por si no se registra ningún número positivo/negativo
			medPos = medPos / contPos;
		}
		if(contNeg>0) {
			medNeg = medNeg / contNeg;
		}
		// Sacamos los resultados
		System.out.println("POSITIVOS" + "\nCantidad: " + contPos + "\nMedia: " + medPos
				+ "\n\nNEGATIVOS" + "\nCantidad: " + contNeg + "\nMedia: " + medNeg
				+ "\n\nCEROS" + "\nCantidad: " + contCeros);
	}

}
