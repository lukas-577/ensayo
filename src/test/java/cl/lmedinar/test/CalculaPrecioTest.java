package cl.lmedinar.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.lmedinar.recargo.CalculaPrecios;
import cl.lmedinar.recargo.ConRecargo;

public class CalculaPrecioTest {
	
	private final static List<Double> precios = Arrays.asList(1.0,1.0,1.0);
	private final static List<Double> precios2 = Arrays.asList(1.1,1.1,1.1);
	
	@Test
	@DisplayName("prueba el calculo del total simple")
	void pruebaTotal() {
		ConRecargo recargo = new CalculaPrecios();
		
		assertEquals(3.3,recargo.obtenerTotal(precios));
	}
	
	
	
	@Test
	@DisplayName("prueba el calculo del total simple")
	void pruebaRecargo() {
		ConRecargo recargo = new CalculaPrecios();
		
		assertEquals(precios2,recargo.aplicarRecargo(precios));
	}

}
