package builders;

public class Director {

    public Director(Builder builder) {
        builder.reset();
        String tipoCasa = builder.getBuilder();
        switch (tipoCasa){
            case "Madeira":
                Builder casaMadeira = new WoodHouseBuilder();
                System.out.println("Casa de madeira: \n");
                casaMadeira.buildChao();
                casaMadeira.buildJanelas();
                casaMadeira.buildPortas();
                casaMadeira.buildTelhado();

                break;
            case "Vidro":
                Builder casaVidro = new GlassHouseBuilder();
                System.out.println("Casa de vidro: \n");
                casaVidro.buildChao();
                casaVidro.buildJanelas();
                casaVidro.buildPortas();
                casaVidro.buildTelhado();


                break;
            case "Jardim":
                Builder casaJardim = new GardenHouseBuilder();
                System.out.println("Casa com jardim: \n");
                casaJardim.buildChao();
                casaJardim.buildJanelas();
                casaJardim.buildPortas();
                casaJardim.buildTelhado();
                casaJardim.buildJardim();
                break;

            case "Piscina":
                Builder casaPiscina = new PoolHouseBuilder();
                System.out.println("Casa de madeira: \n");
                casaPiscina.buildChao();
                casaPiscina.buildJanelas();
                casaPiscina.buildPortas();
                casaPiscina.buildTelhado();
                casaPiscina.buildPiscina();

                break;
    }}
}
