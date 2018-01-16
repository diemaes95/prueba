import java.util.*;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//Declaramos los tres vectores y la variable contador
		
		int[] vector1 = new int[12];
		
		int[] vector2 = new int[12];
		
		int[]vector3 = new int[24];
		
		int n, a, b = 0, c = 0, z, x = 23, y = 11;
		
		//Asignamos los valores para los vectores 1 y 2
		
		for(n = 0; n < vector1.length; n++) {
			
			System.out.println("Introduzca un número entero para el vector1.");
				
				vector1[n] = entrada.nextInt();
			
		}
		
		for(n = 0; n < vector2.length; n++) {
			
			System.out.println("Introduzca un número entero para el vector2.");
				
				vector2[n] = entrada.nextInt();
			
		}
		
		//Mezclamos los vectores para el 3
		
		for(n = 0; n<4; n++) {
			
			for(a=0; a<3; a++) {
				
				vector3[b] = vector1[c];
				
				b++;
				c++;
				
			}
			
			b=b+3;
			
			for(z=0; z<3; z++) {
				
				vector3[x] = vector2[y];
				
				x--;
				y--;
				
			}
			
			x = x-3;
			
		}
			
		//Mostramos vector3
			
		for(n=0 ; n < vector3.length ; n++) {
				
				System.out.println("Vector3, indice " +n+ " :" +vector3[n]);
			
			}	
			
			
		}
		
	}


