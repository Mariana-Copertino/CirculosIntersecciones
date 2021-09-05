package circulosIntersecciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class circulosInterseccionesTest {

	@Test
	public void inicializacionPuntoTest() {
		Punto punto = new Punto(1,2);
		assertNotNull(punto);
	}
	
	@Test
	public void inicializacionCirculoTest() {
		Circulo circulo = new Circulo(new Punto(2,5),3);
		assertNotNull(circulo);	
	}
	
	@Test
	public void distanciaEntreDosPuntosTest() {
		Punto punto1 = new Punto(0,1);
		Punto punto2 = new Punto(-4,4);
		assertEquals(5, punto1.distanciaEntreDosPuntos(punto2), 0.0001);
		
	}
	
	@Test
	public void valorEsperadoCentro() {
		Punto punto = new Punto(1,2);
		Circulo circulo = new Circulo(punto ,3);
		assertEquals(punto , circulo.getCentro());
	}
	
	@Test
	public void intersectaConUnSoloPuntoTest() {
		Circulo circulo1 = new Circulo(new Punto(0,0),1);
		Circulo circulo2 = new Circulo(new Punto(2,0), 1);
		assertEquals(true ,circulo1.intersectaCon(circulo2) );
	}
	
	@Test
	public void intersectaConCirculosIgualesTest() {
		Circulo circulo1 = new Circulo(new Punto(-1,2),2.5);
		Circulo circulo2 = new Circulo(new Punto(-1,2),2.5);
		assertEquals(true ,circulo1.intersectaCon(circulo2));
	}
	
	@Test
	public void intersectaConFalsoTest() {
		Circulo circulo1 = new Circulo(new Punto(0,0),1);
		Circulo circulo2 = new Circulo(new Punto(4,0), 1.5);
		assertEquals(false ,circulo1.intersectaCon(circulo2));
	}
	
	@Test(expected = Error.class)
	public void radioNegativoTest() {
		Circulo circulo = new Circulo(new Punto(1,2.2),-4);	
	}
	
	@Test(expected = Error.class)
	public void radioCeroTest() {
		Circulo circulo = new Circulo(new Punto(1.5,2.2),0);	
	}
	
	
}
