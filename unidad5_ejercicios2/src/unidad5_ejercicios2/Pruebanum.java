package unidad5_ejercicios2;

import java.util.Scanner;

public class Pruebanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		 
		 int opcion, num;
		Numero objetoA = new Numero();
		Numero objetoB = new Numero(9);
		Numero objetoC = new Numero();
		//menu con 12 opciones
		do {
		System.out.println("elegir una opcion");
		System.out.println("1.crear un numero nuevo");
		System.out.println("2.modificar el objeto b");
		System.out.println("3.es cero");
		System.out.println("4.es par");
		System.out.println("5.es positivo");
		System.out.println("6.es menor");
		System.out.println("7.es igual");
		System.out.println("8.el menor");
		System.out.println("9.el mayor");
		System.out.println("10.suma");
		System.out.println("11.resta");
		System.out.println("12.salir");
		opcion=entrada.nextInt();
		switch(opcion) {
		//pide que se introduzcan los valores
		//necesarios para crear un nuevo objeto de la clase (objetoC).
		//Muestra el objeto creado y sus atributos.
		case 1:
			System.out.println("introduce un valor para un nuevo objetoc");
			num=entrada.nextInt();
			objetoC.setNum(num);
			System.out.println("el nuevo valor es:"+objetoC.getNum());
			break;
			//pide que se introduzcan los valores
			//necesarios para modificar el objetoB. Muestra los valores del objeto
			//antes y después de modificarlos.
		case 2:
			System.out.println("introduzca el valor para objeto b");
			num=entrada.nextInt();
			
			System.out.println("el valor de objeto b es:"+objetoB.getNum());
			objetoB.setNum(num);
			System.out.println(" el nuevo valor de objetob es:"+objetoB.getNum());
			
			//muestra el mensaje “El objeto A es cero” en caso de que el
			//objetoA sea cero y “El objeto A es distinto de cero” en caso
			//contrario. Muestra también el objetoA.
			
			break;
		case 3:
			
			System.out.println("introduzca el valor para objeto A");
			num=entrada.nextInt();
			if(objetoA.esCero())
			System.out.println("objeto A es 0");
			
			else
				
			System.out.println("objeto A es diferente a 0");
		
			System.out.println("objetoA:"+objetoA.getNum());
			
			break;
			
			//muestra el mensaje “El objeto B es par” en caso de que el
			//objetoB sea par y “El objeto B es impar” en caso contrario. Muestra
			//también el objetoB.
		case 4:
			if(objetoB.esPar())
				System.out.println("objeto b es par");
			else
				System.out.println("objeto A  es impar");
			System.out.println("objetoA:"+objetoA.getNum());
			break;
			//muestra el mensaje “El objeto C es negativo” en caso de
			//que el objetoC no sea positivo y “El objeto C es positivo” en caso
			//contrario. Muestra también el objetoC.
		case 5:
			if(!objetoC.esPositivo())
				System.out.println("objeto c es negativo");
			else
				System.out.println("objeto c es positivo");
			System.out.println("valor de objetoc:"+objetoC.getNum());
			break;
			//el objetoA llama al método correspondiente con objetoC
			//como argumento. Muestra un mensaje que indique cuál de los dos
			//objetos es mayor. Muestra también los dos objetos.
			
		case 6:
			if(objetoA.esMenor(objetoC))
				System.out.println("objeto C es mayor");
			else
				System.out.println("objeto A  es mayor");
			
			System.out.println("objeto c:"+objetoC.getNum());
			System.out.println("objeto a:"+objetoA.getNum());
			break;
			//: el objetoC llama al método correspondiente con objetoB
			//como argumento. Muestra un mensaje que indique si son iguales o
		//	no. Muestra también los dos objetos.
			//8. El menor: el objetoA llama al método 
		case 7:
			if(objetoC.esIgual(objetoB))
				System.out.println("el objeto B y C son iguales");
			else
				System.out.println("objeto A  b no son iguales");
			System.out.println("objetoB:"+objetoB.getNum());
			System.out.println("objetoC:"+objetoC.getNum());
			break;
		//el objetoA llama al método correspondiente con objetoB
			//como argumento. Muestra los dos objetos y el objeto menor.
		case 8:
				System.out.println("el objetoA:"+objetoA.getNum());
				System.out.println("el objetoB:"+objetoB.getNum());
				System.out.println("el menor es:"+objetoB.elMenor(objetoA).getNum());
			break;
		
		//el objetoB llama al método correspondiente con objetoC
		//	como argumento. Muestra los dos objetos y el objeto mayor.
		
		case 9:
			System.out.println("el objetoB:"+objetoC.getNum());
			System.out.println("el objetoB:"+objetoC.getNum());
			System.out.println("el menor es:"+objetoB.elMayor(objetoC).getNum());
			break;
			//el objetoC llama al método correspondiente con objetoA
			//como argumento suma. Muestra los dos objetos y el resultado
		case 10:
			
			System.out.println("el objetoC:"+objetoA.getNum());
			System.out.println("el objetoC:"+objetoA.getNum());
			System.out.println("la suma es es:"+objetoA.suma(objetoC).getNum());
			break;
			//el objetoC llama al método correspondiente con objetoB
			//como argumento resta. Muestra los dos objetos y el resultado
		case 11:
			System.out.println("el objetoC:"+objetoB.getNum());
			System.out.println("el objetoC:"+objetoB.getNum());
			System.out.println("la suma es es:"+objetoB.resta(objetoC).getNum());
			break;
			
		case 12:
			System.out.println("ha salido del menu");
			
		}
		}while(opcion!=12);
	}

}
