package circulosIntersecciones;

public class Circulo {
	private Punto centro; //La clase círculo tiene como atributo un objeto del tipo Punto
	private double radio;
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.setRadio(radio);
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}
// El radio debe ser mayor que cero para poder construir un círculo
	
	private void setRadio(double radio) {
		if (radio <= 0) {
			Error radioIncorrecto = new Error("El radio debe ser mayor que 0");
			
			throw radioIncorrecto;
		}
		this.radio = radio;
	}
	//Utilizo el método distanciaEntreDosPuntos de la clase Punto 
	
	public boolean intersectaCon(Circulo c){
        return this.centro.distanciaEntreDosPuntos(c.getCentro()) <= this.radio+c.getRadio();
    }

	

}
