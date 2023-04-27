package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

public class Main 
{
    public static void main( String[] args ){

     
           
               
        
             Lector_Archivos lectorArchivos = new Lector_Archivos();
        
                List lista_partidos = lectorArchivos.ParsearPartidos("src/main/resources/Partidos.csv");
                List lista_pronosticos =  lectorArchivos.ParsearPronosticos("src/main/resources/Pronosticos.csv");
        
              
            Map <String,Integer> puntosParticipante = new HashMap <String,Integer>();

            for (Pronostico pronostico : lista_pronosticos){

              
                     for (Partido partido : lista_partidos){

                    if (partido.getFase().equals(pronostico.getFase()) && (partido.getRonda().equals(pronostico.getRonda()) && (partido.getFase().equals(pronostico.getFase()) && (partido.getEquipo_1()).equalsIgnoreCase(pronostico.getEquipo_1())
                    && (partido.getEquipo_2().equalsIgnoreCase (pronostico.getEquipo_2())))))
                        
                   

                     if (partido.GanaEmpataPierde_E1()== pronostico.GanaEmpataPierde_E1())
                     puntosParticipante.put(pronostico.getParticipante(), puntosParticipante.getParticipante())+1){
                    
                     
                     for (String participante : puntosParticipante.keySet()){
                      System.out.println(participante +":" + puntosParticipante);

                     }
                    
                     
                   }

            }

          }














                /*for (int i = 0; i < lista_partidos.size(); i++) {
                  System.out.println(
                  ((Partido) lista_partidos.get(i)).getId_Partido() + "\t" + "\t" +
                  ((Partido) lista_partidos.get(i)).getFase() + "\t" + "\t" + 
                  ((Partido) lista_partidos.get(i)).getRonda() + "\t" + "\t" +
                  ((Partido) lista_partidos.get(i)).getEquipo_1() + "\t" + "\t" + 
                  (((Partido) lista_partidos.get(i)).getGoles_Equipo_1()) + "\t" + "\t" + 
                  (((Partido) lista_partidos.get(i)).getGoles_Equipo_2()) + "\t" + "\t" + 
                  (((Partido) lista_partidos.get(i)).getEquipo_2())) ;*/
                  
                  /*for (int i = 0; i < lista_pronosticos.size(); i++) {
                  System.out.println(
                  ((Pronostico) lista_pronosticos.get(i)).getId_Pronostico() + "\t" + "\t" +
                  ((Pronostico) lista_pronosticos.get(i)).getFase() + "\t" + "\t" + 
                  ((Pronostico) lista_pronosticos.get(i)).getRonda() + "\t" + "\t" +
                  ((Pronostico) lista_pronosticos.get(i)).getParticipante() + "\t" + "\t" +
                  ((Pronostico) lista_pronosticos.get(i)).getGana_1() + "\t" + "\t" + 
                  (((Pronostico) lista_pronosticos.get(i)).getEmpata()) + "\t" + "\t" + 
                  (((Pronostico) lista_pronosticos.get(i)).getPierde_1()));*/


                  
              }

                
                       
                  
                }
        
            
        
        }
     
        
 
       

