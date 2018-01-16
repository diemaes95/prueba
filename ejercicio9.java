package Tema6.ejercicio2;

public class ejercicio9 {

	public static void main(String[] args) {
		
		//Variables y arrays
		
			int [][] [] matriz;
			matriz = new int [9][9][9];
		
		//Procesos
			
			//Creamos la matriz 9x9x9
			for (int i = 0; i < 9; i++) {
				
				for (int j = 0; j < 9; j++) {
					
					for (int k = 0; k < 9; k++) {
						
						if (i == 0 || i == 8 || j == 0 || j == 8 || k == 0 || k == 8) { //Bordes de todas las variables a 1
							
							matriz [i][j][k] = 1;
						}
					}
				}
			}
			
		//Salidas
			
			for (int i = 0; i < 9; i++) {
				
				for (int j = 0; j < 9; j++) {
					
					for (int k = 0; k < 9; k++) {
						
						System.out.print(matriz [i][j][k]);
						
					}
					
				}
				
				System.out.print("\n");
			}
			
			

	}

}
