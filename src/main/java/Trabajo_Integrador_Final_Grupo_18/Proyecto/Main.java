package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import java.util.List;

public class Main 
{
    public static void main( String[] args ){

        public class Main {
            public static void main(String[] args) {
                //En la variable args va a viajar la ruta del archivo que queremos que abra el programa
               
        
             Lector_Archivos lectorArchivos = new Lector_Archivos();
        
                List listapartidos =  lectorArchivos.ParsearPartidos("src/resources/Partidos.csv");
                List lista_pronosticos =  lectorArchivos.ParsearPronosticos("src/resources/Pronosticos.csv");
        
                
                   System.out.println(
                       
                    );
                }
        
            }
        
        }
     
        
 
       
}}
