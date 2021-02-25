package builders;

public class GardenHouseBuilder implements BuilderCasa, BuilderComponentes {


    @Override public void buildTelhado() {
        System.out.println("Construindo telhado");

    }

    @Override public void buildPortas() {
        System.out.println("Construindo portas");

    }

    @Override public void buildChao() {
        System.out.println("Construindo chao");

    }


    @Override public void buildJanelas() {
        System.out.println("Construindo janelas");

    }

    @Override public String getBuilder() {

        return "Jardim";
    }

    @Override public void reset() {

    }

    @Override public void buildEstatuas() {

    }

    @Override public void buildJardim() {

    }

    @Override public void buildPiscina() {

    }
}
