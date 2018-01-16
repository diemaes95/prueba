package unidad5_ejercicios2;

public class Numero {
	private int num;
	
	//constructor por defecto
	public Numero() {
		num=0;
	}
	public  Numero(int num) {
		this.num=num;
		
	}
	//geters y seters
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	// devuelva true si el objeto que llama al método es cero
	//y false en caso contrario.
	public boolean esCero() {
		boolean cero=false;
		if(this.num==0) {
			cero=true;
		}
		return cero;
	}
	//que devuelva true si el objeto que llama al método es par y
	//false en caso contrario
	public boolean esPar() {
		boolean par=false;
		if(this.num%2==0) {
			par=true;
			
			
		}
		return par;
	}
	//que devuelva true si el objeto que llama al método es
	//positivo y false en caso contrario.
	public boolean esPositivo() {
		boolean positivo=false;
		if(this.num>0) 
			positivo=true;
		return positivo;
		
	}
	// devuelva true si el objeto que
	//llama al método es menor que el objeto pasado como argumento y false en
	//caso contrario.
	public boolean esMenor(Numero otronumero) {
		boolean menor=false;
		if(this.num<otronumero.getNum())
			menor=true;
		return menor;
	}
	//devuelva true si los dos objetos
	//son iguales y false en caso contrario.
	
	public boolean esIgual(Numero otronumero) {
		boolean igual=false;
		if(this.num==otronumero.getNum())
			igual=true;
		return igual;
	}
	//que devuelva el objeto que sea
	//menor
	public Numero elMenor(Numero otronumero) {
		Numero menor=otronumero;
		if(this.esMenor(otronumero))
			return this;
		return otronumero;
	}
	//que devuelva el objeto que sea
		//mayor
		public Numero elMayor(Numero otronumero) {
			Numero mayor=otronumero;
			if(this.num>otronumero.getNum())
				mayor.setNum(this.getNum());
			return mayor;
		}
	//que devuelva un objeto de la clase
	//con el resultado de la suma de los dos objetos.
	
	
	 public Numero suma(Numero otronumero) {
		 return new Numero(this.num+otronumero.getNum());
		 
		 
	 }
	 //que devuelva un objeto de la clase con
	 //el resultado de restar al objeto mayor el menor. Usa el método esMenor.
	public Numero resta(Numero otronumero) {
		Numero resta= new Numero();
		if(this.esMenor(otronumero))
		resta.setNum(otronumero.getNum()-this.num);
		else
			resta.setNum(this.num-otronumero.getNum());
		return resta;
	}
	
	
	
	
	
	
	
	
	

}
