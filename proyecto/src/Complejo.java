
public class Complejo {
	
	private double parteReal, parteImaginaria;
	
	public Complejo () {
		this.parteReal = 0;
		this.parteImaginaria = 0;
	}
	
	public Complejo (double parteReal, double parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	//Métodos get
	public double getParteReal() {
		return parteReal;
	}
	
	public double getParteImaginaria() {
		return parteImaginaria;
	}

	//Métodos set
	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	//Método suma
	public Complejo sumar(Complejo num) {
		
		Complejo resultadoSuma = new Complejo (parteReal, parteImaginaria);
		
		resultadoSuma.parteReal = this.parteReal + num.parteReal;
		resultadoSuma.parteImaginaria = this.parteImaginaria + num.parteImaginaria;	
		
		return resultadoSuma;
	}
	
	//Método resta
	public Complejo restar(Complejo num) {
		Complejo resultadoResta = new Complejo (parteReal, parteImaginaria);
		
		resultadoResta.parteReal = this.parteReal - num.parteReal;
		resultadoResta.parteImaginaria = this.parteImaginaria - num.parteImaginaria;
		
		return resultadoResta;
	}
	
	//Método multiplicación
	public Complejo multiplicar(Complejo num) {
		Complejo resultadoMultiplicacion = new Complejo (parteReal, parteImaginaria);
		
		resultadoMultiplicacion.parteReal = this.parteReal * num.parteReal;
		resultadoMultiplicacion.parteImaginaria = this.parteImaginaria * num.parteImaginaria;
		
		return resultadoMultiplicacion;
	}
	
	//Método dividisión
	public Complejo dividir(Complejo num) {
		Complejo resultadoDividir = new Complejo (parteReal, parteImaginaria);
		
		resultadoDividir.parteReal = ((this.parteReal * num.parteReal + this.parteImaginaria * num.parteImaginaria)
				/(num.parteReal * num.parteReal + num.parteImaginaria * num.parteImaginaria));
		resultadoDividir.parteImaginaria  = ((this.parteImaginaria * num.parteReal -  this.parteReal * num.parteImaginaria)
				/(num.parteReal * num.parteReal + num.parteImaginaria * num.parteImaginaria));
		
		return resultadoDividir;
	}	
}
