import java.util.Scanner;

public class MainFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		//Fecha de hoy
		Fecha fechaHoy = new Fecha(24, 11, 2017);

		//Comprobar si la fecha es correcta
		boolean es_correcta = fechaHoy.fechaCorrecta();
		
		if (es_correcta) {
			System.out.println("Su fecha es correcta\n");
			
			//Bucle para mostrar fechas
			System.out.println("Cuántas fechas desea que se muestren? ");
			int aMostrar = entrada.nextInt();
			
			for (int i = 0; i < aMostrar; i++) {
				Fecha fechaM = fechaHoy.diaSiguiente();

				int diaM = fechaM.getDia();
				int mesM = fechaM.getMes();
				int anioM = fechaM.getAnio();

				System.out.println(diaM + "/" + mesM + "/" + anioM);
				
				fechaHoy = fechaM;
			}
			
		} else {
			
			System.out.println("Su fecha no es correcta\n");
			
		}
	}
}
