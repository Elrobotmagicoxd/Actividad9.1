package Actividad9;

public class Card {
    private String PALOS;
    private String COLORES;
    private String VALORES;

    public Card(String PALOS, String COLORES, String VALORES){

        this.PALOS = PALOS;
        this.COLORES = COLORES;
        this.VALORES = VALORES;
    }


    public String getPALOS(){

        return PALOS;
    }

    public String getCOLORES(){

        return COLORES;
    }

    public String getVALORES(){

        return VALORES;
    }




    public void setPALOS(String PALOS){

        this.PALOS = PALOS;
    }

    public void setColor(String Color){

        this.COLORES = COLORES;
    }

    public void setVALORES(String VALORES){

        this.VALORES = VALORES;
    }


    public String toString(){

        return (PALOS + ", " + COLORES + ", " + VALORES);
    }
}
