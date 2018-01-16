package unidad5_ejercicios2;

public class Calcularpunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1= new Punto(8, 12);
		Punto punto2= new Punto(3.5, 5.1);
		Punto punto3= new Punto(2, 3.2);
		Punto lejano = new Punto(0,0),suma=new Punto(0,0);
		
		//calculo de la distancia entre dos puntos
		double distancia = punto1.calcularDistanciaDesde(punto2);
		System.out.println("La distancia de 8.12 a 0.0 es:"+punto1.calcularDistanciaDesde(new Punto(0, 0)));
		//muestre que punto esta mas lejos de p1
		lejano =punto1.lejano(punto2, punto3);
		System.out.println("el punto mas lejano es:("+lejano.getCorx()+","+lejano.getCory()+")");
		suma=punto1.suma(punto3);
		System.out.println("la suma entre punto1 y punto 3 es :("+suma.getCorx()+", "+suma.getCory()+")");
	}

}
