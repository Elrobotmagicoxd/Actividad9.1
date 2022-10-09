package Actividad9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
    private final String[] PALOS = {"TREBOLES", "CORAZONES", "PICAS", "DIAMANTES"};
    private final String[] COLORES = {"Rojo", "Negro"};
    private final String[] VALORES = {"2", "3", "4", "5", "6", "7", "8","9", "10", "J", "Q", "K"};


    private ArrayList<Card> mazo;

    public Deck(){

        mazo = new ArrayList<Card>();


        for(int i = 0; i < 2; i++){

            for(int j = 0; j < VALORES.length; j++){

                mazo.add(new Card(PALOS[i], COLORES[0],VALORES[j]));
            }
        }

        for(int i = 2; i < 4; i++){

            for(int j = 0; j < VALORES.length; j++){

                mazo.add(new Card(PALOS[i], COLORES[1], VALORES[j]));
            }
        }
    }


    public int getSize(){

        return mazo.size();
    }



    public ArrayList<Card> getDeck(){

        return mazo;
    }

    public void shuflle() {
        Collections.shuffle(mazo);
        System.out.println("Mezclamos el deck.");
        for (Object objeto : mazo)
        {
            System.out.print(mazo + " /n ");
        }
    }

    public void head(){
        System.out.println(mazo.get(0));
        mazo.remove(0);
        System.out.println("Quedan " + mazo.size() + " cartas");
    }


    public void pick() {
        Random random = new Random();
        System.out.println(mazo.get(random.nextInt(mazo.size())));
        mazo.remove(random.nextInt(mazo.size()));
        System.out.println("Quedan " + mazo.size() + " cartas");
    }

    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(mazo.get(i));
        }
        for(int i=0; i<=4; i++){
            mazo.remove(i);
        }
        System.out.println("Quedan " + mazo.size()+ " cartas");
    }

}
