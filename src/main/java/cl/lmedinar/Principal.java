package cl.lmedinar;


import java.util.List;

import cl.lmedinar.recargo.CalculaPrecioEspecial;
import cl.lmedinar.recargo.CalculaPrecios;
import cl.lmedinar.recargo.ConRecargo;


public class Principal {
	public static void main(String[] args) {
		
		
		
		List<Double> precios = Utilitaria.creaListaAlatoria();
		
		
		ConRecargo recargo = new CalculaPrecios();
		List<Double> preciosRecargo = recargo.aplicarRecargo(precios);
		Double total = recargo.obtenerTotal(precios);
		
		ConRecargo recargoEspecial = new CalculaPrecioEspecial();
		List<Double> preciosRecargoEspecial = recargoEspecial.aplicarRecargo(precios);
		Double totalEspecial = recargoEspecial.obtenerTotal(precios);
		
		System.out.println("Para los números aleatorios: "+ precios);
		System.out.println("---------------------");
		System.out.println("Se generan los siguientes cálculos:");
		System.out.println("---------------------");
		System.out.println("Calculo normal, elementos con recargo aplicado:"); 
		System.out.println(preciosRecargo);
		System.out.println("se obtiene un total de: "+ total );
		System.out.println("---------------------");
		System.out.println("Calculo especial, elementos con recargo aplicado:"); 
		System.out.println(preciosRecargoEspecial);
		System.out.println("se obtiene un total de: "+totalEspecial);
		
		
	}

}
