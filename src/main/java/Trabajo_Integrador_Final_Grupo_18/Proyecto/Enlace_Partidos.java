package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import com.opencsv.bean.CsvBindByPosition;

public class Enlace_Partidos {

    @CsvBindByPosition(position = 0)
    private Integer Id_Partido;
    @CsvBindByPosition(position = 1)
    private Integer Fase;
    @CsvBindByPosition(position = 2)
    private Integer Ronda;
    @CsvBindByPosition(position = 3)
    private String Participante;
    @CsvBindByPosition(position = 4)
    private String Equipo_1;
    @CsvBindByPosition(position = 5)
    private String Gana_1;
    @CsvBindByPosition(position = 6)
    private String Empata;
    @CsvBindByPosition(position = 7)
    private String Pierde_1;
    @CsvBindByPosition(position = 8)
    private String Equipo_2;

    