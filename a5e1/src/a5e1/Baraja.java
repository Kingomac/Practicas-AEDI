package a5e1;

import pila.*;

/**
 *
 * @author Mario
 */
public class Baraja {

    private Pila<Carta> baraja;
//    private Stack<Carta> baraja;
    private int numCartas;

    public Baraja() {
        numCartas = 0;
        baraja = new EnlazadaPila<>(); // new Stack<>();

        for (int i = 0; i < 5; i++) {
            baraja.push(new Carta("Nigiri de calamar"));
            baraja.push(new Carta("Nigiri de tortilla"));
            baraja.push(new Carta("Nigiri de salmón"));
            baraja.push(new Carta("Nigiri de salmón"));
            numCartas += 4;
        }

        for (int i = 0; i < 6; i++) {
            baraja.push(new Carta("Wasabi"));
            baraja.push(new Carta("Maki de 1 rollo"));
            baraja.push(new Carta("Maki de 2 rollos"));
            baraja.push(new Carta("Maki de 2 rollos"));
            numCartas += 4;
        }

        for (int i = 0; i < 8; i++) {
            baraja.push(new Carta("Maki de 3 rollos"));
            numCartas++;
        }

        for (int i = 0; i < 14; i++) {
            baraja.push(new Carta("Tempura"));
            baraja.push(new Carta("Sashimi"));
            baraja.push(new Carta("Gyoza"));
            numCartas += 3;
        }
        barajar();
    }

    private void barajar() {
        Carta[] cartas = new Carta[94];
        while (!baraja.esVacio()) {
            int i;
            do {
                i = (int) (Math.random() * 94);
            } while (cartas[i] != null);
            cartas[i] = baraja.pop();
        }
        for (Carta carta : cartas) {
            baraja.push(carta);
        }
    }

    public Carta darCarta() {
        return baraja.pop();
    }

    public int getNumCartas() {
        return numCartas;
    }

    @Override
    public String toString() {
        Pila<Carta> cartas = new EnlazadaPila<>();
        StringBuilder toret = new StringBuilder();
        while (!baraja.esVacio()) {
            cartas.push(baraja.pop());
        }

        while (!cartas.esVacio()) {
            baraja.push(cartas.pop());
            toret.append(baraja.top().toString()).append(" | ");
        }
        return toret.toString();
    }
}
