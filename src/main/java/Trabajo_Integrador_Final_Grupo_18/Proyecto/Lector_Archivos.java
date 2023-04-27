package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lector_Archivos {

	    String rutaArchivo;
	    List<Enlace_Partidos> partidosJugados;
		List <Enlace_Pronosticos> pronosticos;
	    

	    public Lector_Archivos(String ruta) {
	        this.rutaArchivo = ruta;
	        this.partidosJugados = new ArrayList<>();
	        this.pronosticos = new ArrayList <>();
	    }

	    public void parsearArchivo() {
	        List<Enlace_Partidos> lista_de_partidos_jugados = null;
			List<Enlace_Pronosticos> lista_de_pronosticos = null;
	       
	        
	        try {
	            // En esta primera línea definimos el archivos que va a ingresar
	            lista_de_partidos_jugados= new CsvToBeanBuilder(new FileReader(this.rutaArchivo))
	                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
	                    .withSkipLines(1)
	                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
	                    .withSeparator(';')
	                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
	                    .withType(Enlace_Partidos.class)
	                    .build()
	                    .parse();

	        } catch (IOException e) {
	        e.printStackTrace();
	    }
	        this.partidosJugados = lista_de_partidos_jugados;
	    
	   
	    
	     try {
	            // En esta primera línea definimos el archivos que va a ingresar
	            lista_de_pronosticos = new CsvToBeanBuilder(new FileReader(this.rutaArchivo))
	                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
	                    .withSkipLines(1)
	                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
	                    .withSeparator(';')
	                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
	                    .withType(Enlace_Pronosticos.class)
	                    .build()
	                    .parse();

	        } catch (IOException e) {
	        e.printStackTrace();
	    }
	        this.pronosticos = lista_de_pronosticos;
	    }
	}
	    
	    
	    
	    
	    
	    
	    
