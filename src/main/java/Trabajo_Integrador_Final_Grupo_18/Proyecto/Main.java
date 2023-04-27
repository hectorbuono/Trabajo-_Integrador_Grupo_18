package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import java.util.List;
import java.io.*;

public class Main 
{
    public static void main( String[] args ){

     
           
               
        
             Lector_Archivos lectorArchivos = new Lector_Archivos();
        
                List listapartidos =  lectorArchivos.ParsearPartidos("src/main/resources/Partidos.csv");
                List lista_pronosticos =  lectorArchivos.ParsearPronosticos("src/main/resources/Pronosticos.csv");
        
                
                   listapartidos.forEach(System.out::println);
                       
                  
                }
        
            
        
        }
     
        
 
       

