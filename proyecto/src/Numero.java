// Clase Numero
public class Numero {

	int numero;

	// Constructor por defecto
	public Numero() {
		this.numero = 0;

	}

	// Constructor con argumentos
	public Numero(int numero) {
		this.numero = numero;
	}

	// Get
	public int getNumero() {
		return numero;
	}

	// Set
	public void setNumero(int numero) {
		this.numero = numero;
	}

	// esCero
	public boolean esCero() {
		if (numero == 0) {
			return true;
		} else {
			return false;
		}
	}

	// esPar
	public boolean esPar() {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// esPositivo
	public boolean esPositivo() {
		if (numero < 0) {
			return false;
		} else {
			return true;
		}
	}

	// esMenor
	public boolean esMenor(Numero otroNumero) {
		if (otroNumero.numero < this.numero) {
			return true;
		} else {
			return false;
		}
	}

	// esIgual
	public boolean esIgual(Numero otroNumero) {
		if (otroNumero.numero == this.numero) {
			return true;
		} else {
			return false;
		}
	}

	// elMenor
	public Numero elMenor(Numero otroNumero) {

		Numero esteNumero = new Numero(numero);

		if (otroNumero.esMenor(esteNumero)) {
			return esteNumero;
		} else {
			return otroNumero;
		}
	}

	// elMayor
	public Numero elMayor(Numero otroNumero) {

		Numero esteNumero = new Numero(numero);

		if (otroNumero.esMenor(esteNumero)) {
			return otroNumero;
		} else {
			return esteNumero;
		}
	}

	// suma
	public Numero suma(Numero otroNumero) {
		Numero sumaNumero = new Numero(numero);

		sumaNumero.numero = this.numero + otroNumero.numero;

		return (sumaNumero);

	}

	// resta
	public Numero resta(Numero otroNumero) {
		Numero restaNumero = new Numero(numero);

		if (otroNumero.esMenor(restaNumero)) {
			restaNumero.numero = otroNumero.numero - restaNumero.numero;
		} else {
			restaNumero.numero = restaNumero.numero - otroNumero.numero;
		}

		return restaNumero;
	}
}
