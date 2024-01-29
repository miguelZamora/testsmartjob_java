package cl.cachoza.app001.service;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.cachoza.app001.model.Telefono;
 
public class RegistrarAcciones {
	
	

	private String jsonString = null;
	ObjectMapper objectMapper = new ObjectMapper();
	Telefono telefono = null;

	
	
	public Telefono getTelefonos(  RegistrarAcciones acciones ) {
		
		//Telefono telefono = objectMapper.readValue(jsonString, Telefono.class);
		
		Object[] arreglo = new Object[3];
		arreglo[0] = "number: 55555555";
		arreglo[1] = "citycode: 56";
		arreglo[2] = "contrycode: 2 ";
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    try {
	    	
	    	Telefono telefono = objectMapper.readValue(jsonString, Telefono.class);
	    	telefono.getNumber();
		    return telefono;
		    
		    
	    } catch (Exception e) {
	        // Handle the exception
	        e.printStackTrace();
	    }
		return telefono;
	    
	    
	}



	public Object getTelefonos(Object regac, Long usuarioId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
