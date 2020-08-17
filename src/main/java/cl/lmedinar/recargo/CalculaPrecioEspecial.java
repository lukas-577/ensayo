package cl.lmedinar.recargo;

import java.util.ArrayList;
import java.util.List;

import cl.lmedinar.Utilitaria;

public class CalculaPrecioEspecial implements ConRecargo {
	
	@Override
	public Double obtenerTotal(List<Double> precios) {
		Double total = 0.0;
		//al precio que me llego le aplique el recargo y como aplicarRecargo retorna una lista me llego aca 
		for(Double precio: aplicarRecargo(precios))
			total= total + precio;
		
		
		return Utilitaria.aproxima(total);
	}

	@Override
	public List<Double> aplicarRecargo(List<Double> precios) {
		
		List<Double> preciosAux = new ArrayList<>(); 
		
		Double factor = 1.0;
		
		Double suma = Utilitaria.sumaLista(precios);
		
		if(suma<10000.0) {
			factor=1.2;
		}else if(suma<50000.0) {
			factor=1.1;
		}
			
			
		
		//recorrer cada uno de estos elementos
		
		for(Double precio: precios)
			preciosAux.add(Utilitaria.aproxima(precio * factor));
		
		//retorno esta lista
		return preciosAux;
	}

}
