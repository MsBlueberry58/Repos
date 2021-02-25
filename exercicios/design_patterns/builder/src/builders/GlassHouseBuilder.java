package builders;

public class GlassHouseBuilder implements BuilderCasa {

    @Override public void buildTelhado() {
        System.out.println("Construindo telhado de vidro");

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

        return "Vidro";
    }

    @Override public void reset() {

    }
}
