package Trabajo_Integrador_Final_Grupo_18.Proyecto;
import com.opencsv.bean.CsvBindByPosition;
public class Enlace_Pronosticos {
    
        @CsvBindByPosition(position = 0)
        private Integer Id_Pronostico;
        @CsvBindByPosition(position = 1)
        private Integer Fase;
        @CsvBindByPosition(position = 2)
        private Integer Ronda;
        @CsvBindByPosition(position = 3)
        private String Equipo_1;
        @CsvBindByPosition(position = 4)
        private Integer Goles_Equipo_1;
        @CsvBindByPosition(position = 5)
        private Integer Goles_Equipo_2;
        @CsvBindByPosition(position = 6)
        private String Equipo_2;



}
