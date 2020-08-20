package cl.lmedinar;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utilitaria {
	
	private Utilitaria() { //constructor vacio para que no se pueda hacer una instancia 
		
	}
	
	public static List<Double> creaListaAlatoria(){
//		metodo para obtener lista aleatoria
		
		Random r = new Random();
		List<Double> precios = new ArrayList<>();
		for(int i = 0; i < 10; i++)
		    precios.add((double) r.nextInt(70000));
		
		return precios;
		
	}
	//metodo para aproximar valores decimales
	public static Double aproxima(Double val) {
	    return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	//por cada uno de los elementos voy a sumarlos y retornar la suma
	public static Double sumaLista(List<Double> lista) {
		Double suma = 0.0;
		
		for(Double num:lista)
			suma= suma+num;
		
		return suma;
	}
	
}
