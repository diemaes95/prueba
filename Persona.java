
public class Persona { //Incluir peso y altura y añadir un método que sea calcular el IMC
	
	private String nombre, apellidos;
	private int edad;
	private double peso, altura;
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		peso=0;
		altura=0;
	}
	
	public Persona(String nombre, String apellidos, int edad, double altura, double peso) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.altura=altura;
		this.edad=edad;
	}
	
	public void setApellido(String apellidos) { //Usamos this para distinguir el apellidos de la variable declarada con el argumento metido 
		this.apellidos=apellidos;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public double calcularIMC(double peso, double altura) {
		double imc;
		imc= peso/(altura*altura);
		return imc;
	}

}
