package unidad5_ejercicios2;

public class Punto {

	private double corx;
	private double cory;
	
	//constructor
	public Punto(double corx, double cory) {
		this.corx=corx;
		this.cory=cory;
		
	}
	
	//metodo de acceso get 
	public double getCorx() {
		return corx;
	}
	public double getCory() {
		return corx;
		
	}
	public Punto suma(Punto otropunto) {
		return new Punto(otropunto.getCorx()+this.corx, otropunto.getCory()+this.cory);
	}
	public double calcularDistanciaDesde(Punto parametros) {
		double cateto1 = corx - parametros.getCorx();
		double cateto2 = cory - parametros.getCory();
		double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		return hipotenusa;
		
		
	}
	public Punto lejano(Punto p1, Punto p2){
		if(this.calcularDistanciaDesde(p1)>this.calcularDistanciaDesde(p2)){
			return p1;
		}
		return p2;
		}
	
	
}
