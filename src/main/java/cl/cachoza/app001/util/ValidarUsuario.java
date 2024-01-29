package cl.cachoza.app001.util;
import java.util.regex.*;


public class ValidarUsuario {
	

	
	
	
	public Boolean correoValidar (String correo ) {
        String email = correo;
        Pattern patron = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$");
        Matcher matcher = patron.matcher(email);
        boolean valido = matcher.matches();
        if (valido) {
            //System.out.println("El correo electrónico es válido.");
        } else {
            //System.out.println("El correo electrónico no es válido.");
        	
        }
		 return valido; 
	}

	
	
	
	
	
	
}
