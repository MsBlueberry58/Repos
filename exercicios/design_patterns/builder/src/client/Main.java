package client;

import builders.*;

public class Main {

    public static void main(String[] args) {

        Director diretor = new Director();
        CatupiryBuilder pizzacatupiry = new CatupiryBuilder();
        CalabresaBuilder pizzacalabresa = new CalabresaBuilder();
        PepperoniBuilder pizzapepperoni = new PepperoniBuilder();

        diretor.makePizza(pizzacatupiry);
        diretor.makePizza(pizzacalabresa);
        diretor.makePizza(pizzapepperoni);



    }
}
