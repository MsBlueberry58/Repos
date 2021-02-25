package client;

import builders.*;

public class Main {

    public static void main(String[] args) {

        WoodHouseBuilder fazerMadeira = new WoodHouseBuilder();
        GardenHouseBuilder fazerJardim = new GardenHouseBuilder();
        GlassHouseBuilder fazerVidro = new GlassHouseBuilder();
        PoolHouseBuilder fazerPiscina = new PoolHouseBuilder();

        Director diretor = new Director(fazerMadeira);
        Director diretor2 = new Director(fazerVidro);
        Director diretor3 = new Director(fazerPiscina);
        Director diretor4 = new Director(fazerJardim);



    }
}
