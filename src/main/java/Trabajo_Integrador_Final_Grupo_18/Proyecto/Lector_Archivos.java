package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;


    public class Lector_Archivos{

       

    public List ParsearPartidos(String rutaPartidos) {

        List<Partido> lista_partidos_jugados= null;
        
        try {
            // En esta primera línea definimos el archivos que va a ingresar
            lista_partidos_jugados = new CsvToBeanBuilder(new FileReader(rutaPartidos))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(Partido.class)
                    .build()
                    .parse();

        } catch (IOException e) {
        e.printStackTrace();
    }
        return lista_partidos_jugados;
}
        public List ParsearPronosticos(String rutaPronostico) {
            List <Pronostico> lista_pronosticos = null;

        try {
            // En esta primera línea definimos el archivos que va a ingresar
            lista_pronosticos = new CsvToBeanBuilder(new FileReader(rutaPronostico))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(Pronostico.class)
                    .build()
                    .parse();

        } catch (IOException e) {
        e.printStackTrace();
    }
        return lista_pronosticos;
    }

    
    
}