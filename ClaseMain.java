package circulosIntersecciones;

public class ClaseMain {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		Circulo c3 = new Circulo(new Punto(8, 1), 3);
		
		System.out.println("Los círculos se intersectan: " + c1.intersectaCon(c2));
		System.out.println("Los círculos se intersectan: " + c1.intersectaCon(c3));
	}

}
