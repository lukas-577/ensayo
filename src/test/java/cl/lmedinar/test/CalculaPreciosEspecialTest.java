package cl.lmedinar.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.lmedinar.recargo.CalculaPrecioEspecial;
import cl.lmedinar.recargo.ConRecargo;

public class CalculaPreciosEspecialTest {
	
	private final static List<Double> precios = Arrays.asList(25000.0,25000.0);
	
	
	@Test
	@DisplayName("prueba el calculo del total simple")
	void pruebaTotal() {
		ConRecargo recargo = new CalculaPrecioEspecial();
		
		assertEquals(50000.0,recargo.obtenerTotal(precios));
	}
	
	
	
	@Test
	@DisplayName("prueba el calculo del total simple")
	void pruebaRecargo() {
		ConRecargo recargo = new CalculaPrecioEspecial();
		List<Double> precios2 = Arrays.asList(25000.0,25000.0);
		assertEquals(precios2,recargo.aplicarRecargo(precios));
	}

}
