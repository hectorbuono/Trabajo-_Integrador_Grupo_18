package Trabajo_Integrador_Final_Grupo_18.Proyecto;
import com.opencsv.bean.CsvBindByPosition;
public class Partido {
    
        @CsvBindByPosition(position = 0)
        private Integer Id_Partido;
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




    /**
     * @return Integer return the Id_Pronostico
     */
    public Integer getId_Partido() {
        return Id_Partido;
    }

    /**
     * @param Id_Partido the Id_Pronostico to set
     */
    public void setId_Pronostico(Integer Id_Partido) {
        this.Id_Partido = Id_Partido;
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
     * @return Integer return the Goles_Equipo_1
     */
    public Integer getGoles_Equipo_1() {
        return Goles_Equipo_1;
    }

    /**
     * @param Goles_Equipo_1 the Goles_Equipo_1 to set
     */
    public void setGoles_Equipo_1(Integer Goles_Equipo_1) {
        this.Goles_Equipo_1 = Goles_Equipo_1;
    }

    /**
     * @return Integer return the Goles_Equipo_2
     */
    public Integer getGoles_Equipo_2() {
        return Goles_Equipo_2;
    }

    /**
     * @param Goles_Equipo_2 the Goles_Equipo_2 to set
     */
    public void setGoles_Equipo_2(Integer Goles_Equipo_2) {
        this.Goles_Equipo_2 = Goles_Equipo_2;
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
    if (this.Goles_Equipo_1 > this.Goles_Equipo_2)
        return EnumResultado.GANADOR;
    
        if (this.Goles_Equipo_1 < this.Goles_Equipo_2)
        return EnumResultado.PERDEDOR;
        if (this.Goles_Equipo_1 == this.Goles_Equipo_2)
        return EnumResultado.EMPATE;
        
        
    
    }

}
