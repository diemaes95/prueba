import java.util.Scanner;

public class mainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		Persona persona1= new Persona("Antonio", "Mirallas", 23, 64, 1.73), persona3= new Persona();
		Persona persona2=new Persona();
		
		String NombrePersona1=persona1.getNombre(), NombrePersona3;
		String ApellidoPersona1=persona1.getApellidos(), ApellidoPersona3;
		int EdadPersona1=persona1.getEdad(), EdadPersona3;
		double AlturaPersona1=persona1.getAltura(), AlturaPersona3;
		double PesoPersona1=persona1.getAltura(), PesoPersona3;
		
		//Da error porque nombre lo hemos puesto privado en la clase Persona
		
		persona2.setNombre("Alvaro");
		persona2.setApellido("Moya");
		persona2.setEdad(25);
		
		do {
			System.out.println("Introduzca el nombre, apellido, edad, peso (en Kg, mayor que cero) y la altura (en m, mayor que cero): ");
			persona3.setNombre(entrada.next());
			persona3.setApellido(entrada.next());
			persona3.setEdad(entrada.nextInt());
			persona3.setPeso(entrada.nextDouble());
			persona3.setAltura(entrada.nextDouble());
		}while(persona3.getEdad()<=0 || persona3.getAltura()<=0 || persona3.getPeso()<=0);
		
		System.out.println("El IMC de "+persona3.getNombre()+" "+persona3.getApellidos()+" es "+persona3.calcularIMC(persona3.getPeso(), persona3.getAltura()));
	}
		

}
