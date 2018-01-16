import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int x,z;
		int[] vector1;
		int[] vector2;
		vector1 = new int[10];
		vector2 = new int[10];
		for (int j=0; j<10; j++ ) {
			System.out.println("Introduce número para primer array: ");
			x = entrada.nextInt();
			vector1[j]= x;
		}
		for (int j=0; j<10; j++ ) {
			System.out.println("Introduce número para segundo array: ");
			z = entrada.nextInt();
			vector2[j]= z;
		}
		 
	}

}
