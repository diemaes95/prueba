//import java.util.Scanner;
//public class EJ13 {
////NO TERMINADO
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//Declaro el array y pido sus valores
//		Scanner sc=new Scanner(System.in);
//		int vector[];
//		vector=new int[10];
//		int posicionActual=0;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Introduzca el valor de la posición " + i + " del vector");
//			vector[i] = sc.nextInt();
//		}
//		
//		//Declaro el segundo array
//		int vector2[];
//		vector2= new int[10];
//
//		//Proceso
//		
//		for(int i=0;i<10;i++) {
//			if(vector[i]%2==0) {
//				for(int j=posicionActual;j<=posicionActual+1;j++) {	//El problema es que siempre recorre este bucle completo y lo completa con el último número par
//					vector2[j]=vector[i];
//					posicionActual++;
//				}
//			}
//		}
//		
//		
//		
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Posición " + i + " del vector: " + vector2[i]);
//		}
//
//		
//	}
//
//}
