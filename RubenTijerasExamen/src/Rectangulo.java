
public class Rectangulo {// dale una colleja al de las luces ruben =) //

	private double base, altura;

	// Constructores

	public Rectangulo(double base, double altura) { // Constructor por parámetros
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() { // Constructor por defecto
		double base = 0;
		double altura = 0;
	}

	// MÉTODOS, GETTER Y SETTER.

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		double area; // Creamos la variable area donde depositaremos el valor del area

		area = this.base * this.altura;

		return area; // Devolvemos area
	}

	public double perimetro() {
		double perimetro; // Igual que en perimetro. Creamos variable y depositamos resultado

		perimetro = this.base * 2 + this.altura * 2;

		return perimetro; // Devolvemos resultado
	}

	public double diagonal() {
		double diagonal; // variable que devolveremos

		diagonal = (Math.sqrt(this.base * this.base + this.altura * this.altura)); // diagonal es double asique
																					// le introducimos un double

		return diagonal;
	}

	public void invierte() {
		double cambio;
		cambio = this.altura;
		this.altura = this.base;
		this.base = cambio;
	}

	public boolean cambiaTamano(int porcentaje) {
		boolean cambio = false;

		if (porcentaje > 1 && porcentaje < 500) { // Filtramos para que el porcentaje sea entre 1 y 500
			if (porcentaje < 100) {
				this.base = this.base / 100;
				this.base = this.base * porcentaje; // Modificamos el tamaño al porcentaje requerido.
				this.altura = this.altura / 100;
				this.altura = this.altura * porcentaje;
				cambio = true;
			}
			// La operación será la misma en caso de ser mayor de 100 y menor.
			if (porcentaje > 100) {
				this.base = this.base / porcentaje;
				this.base = this.base * porcentaje;
				this.altura = this.altura / porcentaje;
				this.altura = this.altura * porcentaje;
				cambio = true;
			}
		}

		return cambio; // Devolvemos true o false si se ha hecho o no el cambio de tamaño.
	}

	public boolean opera(Rectangulo rect) {
		boolean cambio = false; // Cambio será false a no ser que se produzcan cambios.

		if (this.diagonal() == rect.diagonal()) { // Filtramos para que solo opere si las diagonales coinciden

			rect.cambiaTamano(25); // Cambiamos tamaño a un 25% del original

			if (rect.cambiaTamano(25) == true) { // Si se hace el cambio de tamaño operamos.
				rect.altura = this.base + rect.altura;
				rect.base = this.altura + rect.base;
				cambio = true;
			}
		}

		return cambio; // Solo si todo se completa devolveremos true.
	}

	public boolean cambiaACuadrado() {
		Rectangulo rect = new Rectangulo();
		boolean cambio = false;

		if (this.esCuadrado() == false) { // Si no es cuadrado operará para hacerlo cuadrado. Si lo es, no hará nada.
			rect.base = this.base + this.altura;
			rect.altura = rect.base;
			cambio = true;
		}

		return cambio;
	}

	private boolean esCuadrado() {
		boolean cambio = false; // Inicializamos en false

		if (this.base == this.altura) // Si base y altura son iguales cambia a true
			cambio = true;

		return cambio;
	}

}
