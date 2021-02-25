package builders;

public class Director {

    public Director(BuilderCasa builderCasa) {
        builderCasa.reset();
        String tipoCasa = builderCasa.getBuilder();
        switch (tipoCasa){
            case "Madeira":
                BuilderCasa casaMadeira = new WoodHouseBuilder();
                System.out.println("Casa de madeira: \n");
                casaMadeira.buildChao();
                casaMadeira.buildJanelas();
                casaMadeira.buildPortas();
                casaMadeira.buildTelhado();

                break;
            case "Vidro":
                BuilderCasa casaVidro = new GlassHouseBuilder();
                System.out.println("Casa de vidro: \n");
                casaVidro.buildChao();
                casaVidro.buildJanelas();
                casaVidro.buildPortas();
                casaVidro.buildTelhado();


                break;
            case "Jardim":
                BuilderCasa casaJardim = new GardenHouseBuilder();
                BuilderComponentes jardim = new GardenHouseBuilder();
                System.out.println("Casa com jardim: \n");
                casaJardim.buildChao();
                casaJardim.buildJanelas();
                casaJardim.buildPortas();
                casaJardim.buildTelhado();
                jardim.buildJardim();
                break;

            case "Piscina":
                BuilderCasa casaPiscina = new PoolHouseBuilder();
                BuilderComponentes piscina = new PoolHouseBuilder();
                System.out.println("Casa de madeira: \n");
                casaPiscina.buildChao();
                casaPiscina.buildJanelas();
                casaPiscina.buildPortas();
                casaPiscina.buildTelhado();
                piscina.buildPiscina();

                break;
    }}
}
