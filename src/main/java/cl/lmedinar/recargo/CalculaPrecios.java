package cl.lmedinar.recargo;

import java.util.ArrayList;
import java.util.List;

import cl.lmedinar.Utilitaria;

public class CalculaPrecios implements ConRecargo {

	@Override
	public Double obtenerTotal(List<Double> precios) {
		Double total = 0.0;
		//al precio que me llego le aplique el recargo y como aplicarRecargo retorna una lista me llego aca 
		for(Double precio: aplicarRecargo(precios))//tengo que aplicar con el recargo
			total= total + precio;
		
		
		return Utilitaria.aproxima(total);
	}

	@Override
	public List<Double> aplicarRecargo(List<Double> precios) {
		
		List<Double> preciosAux = new ArrayList<>(); // el new ArrayList es por que voy a trabajar con una lista aux de precios no sera la misma que tengo en el principal por que no la quiero modificar la del principal solo esta
		
		Double factor = 1.10;
		
		//recorrer cada uno de estos elementos
		
		for(Double precio: precios)
			preciosAux.add(Utilitaria.aproxima(precio * factor));//agregalos a la lista y  multiplicalos por el factor para cada uno de los precios multiplique por 10porciento
		
		//retorno esta lista
		return preciosAux;
	}

}
