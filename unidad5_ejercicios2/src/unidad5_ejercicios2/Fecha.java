package unidad5_ejercicios2;

public class Fecha {
	//constructor por defecto
	private int dia;
	private int mes;
	private int anio;
	public Fecha(){
		
	}
	//constructor de parametros.
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		
				
		
	}
	//metodos get y set 
	public int getDia() {
		return dia;
		
	}
	public void setDia(int dia) {
		this.dia=dia;
		
	}
	public int getMes() {
		return mes;
	}
	 public void setMes(int mes) {
		 this.mes=mes;
	 }
	 public int getAnio() {
		 return anio;
	 }
	 public void setAnio() {
		 this.anio=anio;
	 }
	 public boolean fechacorrecta() {
		 boolean diaCorrecto, mesCorrecto, anioCorrercto;
		 boolean anioCorrecto = anio>0;
		 mesCorrecto=mes>=1&&mes<=12;
		 //metodo para comprobar si la fecha es correcta
		 switch(mes) {
		 case 2:
			 if(esBisiesto()) {
				 diaCorrecto=dia>=1&&dia<=29;
			 }else {
				 diaCorrecto=dia>=1&&dia<=28;
			 }
			 break;
		 case 4:
		 case 6:
		 case 9:
		 case 11:
			 diaCorrecto=dia>=1&&dia<=30;
			 break;
			 default:
				 diaCorrecto=dia>=1&&dia<=31;
		 
		 }
		 return diaCorrecto && mesCorrecto&&anioCorrecto;
		 
	 }
	 //metodo para comprobar si el año es bisiesto
	private boolean esBisiesto() {
		
		return(anio % 4==0 && anio%100!=0||anio%400==0);
	}
	//metodo que modifica la fecha cambiandola por el dia siguiente
	public void diaSiguiente() {
		dia++;
		if(!fechacorrecta()) {
			dia=1;
			mes++;
			if(!fechacorrecta()) {
				mes=1;
				anio++;
			}
		}
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		if(dia<10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if(mes<10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");
		sb.append(anio);
		return sb.toString();
	}
		
	}
	

