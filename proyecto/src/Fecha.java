
public class Fecha {

	private int dia, mes, anio;

	// Constructor por defecto
	public Fecha() {
		this.dia = 0;
		this.mes = 0;
		this.anio = 0;
	}

	// Constructor con argumentos
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	// Métodos get y set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	// Método es bisiesto
	private boolean esBisiesto() {
		if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// Método fecha correcta
	public boolean fechaCorrecta() {

		boolean lo_es_bisiesto;
		lo_es_bisiesto = esBisiesto();

		boolean es_correcto = true;

		if ((mes < 1) || (mes > 12))
			es_correcto = false;

		if ((anio < 1) || (anio > 2020))
			es_correcto = false;

		if (mes == 2) {
			if (!lo_es_bisiesto) {
				if ((dia < 1) || (dia > 28))
					es_correcto = false;
			} else {
				if ((dia < 1) || (dia > 29))
					es_correcto = false;
			}
		} else {

			if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {

				if ((dia < 1) || (dia > 30)) {
					es_correcto = false;

				} else {

					if ((dia < 1) || (dia > 31)) {
						es_correcto = false;
					}
				}
			}
		}

		if (es_correcto == true)
			return (true);
		else
			return (false);

	}

	// Método dia siguiente
	public Fecha diaSiguiente() {
		int dia_m, mes_m, anio_m;

		boolean lo_es_bisiesto;
		lo_es_bisiesto = esBisiesto();

		if (mes == 2) {

			if (!lo_es_bisiesto) { //Febrero 28 dias

				if (dia < 28) {
					dia_m = dia + 1;
					mes_m = mes;
					anio_m = anio;
				} else {
					if (mes != 12) {
						dia_m = 1;
						mes_m = mes + 1;
						anio_m = anio;
					} else {
						dia_m = 1;
						mes_m = 1;
						anio_m = anio + 1;
					}
				}
				
			} else {  //Febrero 29 dias
				if (dia < 29) { 
					dia_m = dia + 1;
					mes_m = mes;
					anio_m = anio;
				} else {
					if (mes != 12) {
						dia_m = 1;
						mes_m = mes + 1;
						anio_m = anio;
					} else {
						dia_m = 1;
						mes_m = 1;
						anio_m = anio + 1;
					}
				}
			}

		} else { //Meses de 30 dias

			if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {

				if (dia < 30) {
					dia_m = dia + 1;
					mes_m = mes;
					anio_m = anio;
				} else {
					if (mes != 12) {
						dia_m = 1;
						mes_m = mes + 1;
						anio_m = anio;
					} else {
						dia_m = 1;
						mes_m = 1;
						anio_m = anio + 1;
					}
				}

			} else { // Meses de 31 dias

				if (dia < 31) {
					dia_m = dia + 1;
					mes_m = mes;
					anio_m = anio;
				} else {
					if (mes != 12) {
						dia_m = 1;
						mes_m = mes + 1;
						anio_m = anio;
					} else {
						dia_m = 1;
						mes_m = 1;
						anio_m = anio + 1;
					}
				}
			}  
		}

		Fecha maniana = new Fecha(dia_m, mes_m, anio_m);
		return (maniana);
	}
}
