package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import java.ArrayList;
import java.util.List;
import java.io.*;

public class Main 
{
    public static void main( String[] args ){

     
           
               
        
             Lector_Archivos lectorArchivos = new Lector_Archivos();
        
                List lista_partidos = lectorArchivos.ParsearPartidos("src/main/resources/Partidos.csv");
                List lista_pronosticos =  lectorArchivos.ParsearPronosticos("src/main/resources/Pronosticos.csv");
        
              

                for (int i = 0; i < lista_partidos.size(); i++) {
                  System.out.println(
                  ((Partido) lista_partidos.get(i)).getId_Partido() + "\t" + "\t" + "\t" +
                  ((Partido) lista_partidos.get(i)).getFase() + "\t" + "\t" + "\t" +
                  ((Partido) lista_partidos.get(i)).getRonda() + "\t" + "\t" + "\t" +
                  ((Partido) lista_partidos.get(i)).getEquipo_1() + "\t" + "\t" + "\t" +
                  (((Partido) lista_partidos.get(i)).getGoles_Equipo_1()) + "\t" + "\t" + "\t" +
                  (((Partido) lista_partidos.get(i)).getGoles_Equipo_2()) + "\t" + "\t" + "\t" +
                  (((Partido) lista_partidos.get(i)).getEquipo_2())) ;
                  
                   //System.out.println(MILISTA.get(i).getSexo());
                   //System.out.println(MILISTA.get(i).getDireccion());
                   //System.out.println(MILISTA.get(i).getFecha());
              }

                
                       
                  
                }
        
            
        
        }
     
        
 
       

