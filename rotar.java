package misClases;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*Rotar un array
		*
		*/
		  String palabra = "polevedroN";
		    System.out.println(invertirPalabra(palabra, palabra.length()-1)); //Mostrara en pantalla la palabra Nordevelop
		     
		     
		}
		 
		 public static String invertirPalabra(String palabra, int longitud){
		     
		    if(longitud==0){
		        return palabra.charAt(longitud)+"";
		    }else{
		        return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
		    }
		     

	}

}
