

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {
        int opcion;
        boolean salir = false;

        Deck deck=new Deck();
        do {

            System.out.println("Bienvenido a Poker! ");
            System.out.println("Selecciona una opción: ");
            System.out.println("1° Mezclar deck ");
            System.out.println("2° Sacar una Carta ");
            System.out.println("3° Carta al Azar ");
            System.out.println("4° Generar una mano de 5 cartas");
            System.out.println("5° Salir");
            System.out.println("Elige una de las opciones ");
            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Mezcar deck ");
                    deck.shuffle();

                    break;
                case 2:
                    System.out.println("Sacar Carta");
                    deck.head();
                    break;
                case 3:
                    System.out.println("Carta al Azar ");
                    deck.pick();
                    break;
                case 4:
                    System.out.println("Mano de 5 cartas");
                    deck.hand();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Opción  no valida, Solo hay opciones de calculos 1 y 2");
                    break;

            }
        }while (salir!=true);
    }

}
