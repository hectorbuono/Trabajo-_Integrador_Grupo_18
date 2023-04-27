package Trabajo_Integrador_Final_Grupo_18.Proyecto;

import com.opencsv.bean.CsvBindByPosition;

public class Pronostico {

    @CsvBindByPosition(position = 0)
    private Integer Id_Pronostico;
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





    

    /**
     * @return Integer return the Id_Pronostico
     */
    public Integer getId_Pronostico() {
        return Id_Pronostico;
    }

    /**
     * @param Id_Pronostico the Id_Pronostico to set
     */
    public void setId_Pronostico(Integer Id_Pronostico) {
        this.Id_Pronostico = Id_Pronostico;
    }

    /**
     * @return Integer return the Fase
     */
    public Integer getFase() {
        return Fase;
    }

    /**
     * @param Fase the Fase to set
     */
    public void setFase(Integer Fase) {
        this.Fase = Fase;
    }

    /**
     * @return Integer return the Ronda
     */
    public Integer getRonda() {
        return Ronda;
    }

    /**
     * @param Ronda the Ronda to set
     */
    public void setRonda(Integer Ronda) {
        this.Ronda = Ronda;
    }

    /**
     * @return String return the Participante
     */
    public String getParticipante() {
        return Participante;
    }

    /**
     * @param Participante the Participante to set
     */
    public void setParticipante(String Participante) {
        this.Participante = Participante;
    }

    /**
     * @return String return the Equipo_1
     */
    public String getEquipo_1() {
        return Equipo_1;
    }

    /**
     * @param Equipo_1 the Equipo_1 to set
     */
    public void setEquipo_1(String Equipo_1) {
        this.Equipo_1 = Equipo_1;
    }

    /**
     * @return String return the Gana_1
     */
    public String getGana_1() {
        return Gana_1;
    }

    /**
     * @param Gana_1 the Gana_1 to set
     */
    public void setGana_1(String Gana_1) {
        this.Gana_1 = Gana_1;
    }

    /**
     * @return String return the Empata
     */
    public String getEmpata() {
        return Empata;
    }

    /**
     * @param Empata the Empata to set
     */
    public void setEmpata(String Empata) {
        this.Empata = Empata;
    }

    /**
     * @return String return the Pierde_1
     */
    public String getPierde_1() {
        return Pierde_1;
    }

    /**
     * @param Pierde_1 the Pierde_1 to set
     */
    public void setPierde_1(String Pierde_1) {
        this.Pierde_1 = Pierde_1;
    }

    /**
     * @return String return the Equipo_2
     */
    public String getEquipo_2() {
        return Equipo_2;
    }

    /**
     * @param Equipo_2 the Equipo_2 to set
     */
    public void setEquipo_2(String Equipo_2) {
        this.Equipo_2 = Equipo_2;
    }

    public EnumResultado GanaEmpataPierde_E1(){
          if (this.Gana_1 equals("X"))
            return EnumResultado.GANADOR;
          if (this.Empata equals("X"))
            return EnumResultado.EMPATE;
            if (this.Pierde_1 equals("X")2)
            return EnumResultado.PIERDE;
            
    }
}
    