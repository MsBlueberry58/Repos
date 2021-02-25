package builders;

public class GardenHouseBuilder implements Builder {


    @Override public void buildTelhado() {
        System.out.println("Construindo telhado");

    }

    @Override public void buildPortas() {
        System.out.println("Construindo portas");

    }

    @Override public void buildChao() {
        System.out.println("Construindo chao");

    }

    @Override public void buildJardim() {
        System.out.println("Construindo jardim");

    }

    @Override public void buildPiscina() {
        System.out.println("Construindo piscina");

    }

    @Override public void buildJanelas() {
        System.out.println("Construindo janelas");

    }

    @Override public String getBuilder() {

        return "Jardim";
    }

    @Override public void reset() {

    }
}
