package circulosIntersecciones;

public class Punto {
	private double coordenadaX;
	private double coordenadaY;
	
	public Punto(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public double getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	// Usé la fórmula para calcular la distancia entre dos puntos
	
	public double distanciaEntreDosPuntos(Punto p){
        return Math.sqrt(Math.pow(p.getCoordenadaX()-this.coordenadaX, 2)+Math.pow(p.getCoordenadaY()-this.coordenadaY, 2));
    }
}
