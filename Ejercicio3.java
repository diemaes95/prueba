import java.util.* ;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Introducir numero");
		int numero = entrada.nextInt();
		
		int R = numero%2;
		
		if(R==0)
			System.out.println("es par"); 
		else
			System.out.println("es impar");
	}

}
