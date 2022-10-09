package Actividad9;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        int op;
        boolean jugar = true;

        Deck deck = new Deck();
        System.out.println("DECK DE CARTAS PARA INICIAR EL JUEGO: " + deck.getSize());

        while(jugar){

            System.out.println("SELECIONE UNA OPCION: ");
            System.out.println("1. Shuffle");
            System.out.println("2. Head");
            System.out.println("3. Pick");
            System.out.println("4. Hand");
            System.out.println("5. Salir");

            op = line.nextInt();

            switch(op)
            {
                case 1:
                    deck.shuflle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    if(deck.getSize() < 5){
                        System.out.println("TERMINA EL JUEGO");
                    } else {
                        deck.hand();
                    }
                    break;
                case 5:
                    jugar = false;
                    System.out.println("FIN DEL JUEGO");
                    break;
                default:
                    System.out.println("¡¡¡OPCION NO VALIDA!!!");
            }

        }

    }
}
