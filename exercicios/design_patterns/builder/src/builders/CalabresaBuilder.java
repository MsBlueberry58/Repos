package builders;

public class CalabresaBuilder implements PizzaBuilder{

    private CalabresaBuilder pizza = this;


    @Override public void setQueijo() {

    }

    @Override public void setCatupiry() {

    }

    @Override public void setCalabresa() {

    }

    @Override public void setCebola() {

    }

    @Override public void setPepperoni() {

    }

    @Override public void reset() {
        this.pizza = new CalabresaBuilder();
    }

    @Override public PizzaBuilder getPizza() {
        CalabresaBuilder product = this.pizza;
        this.reset();
        return product;
    }

    @Override public String getTipo() {
        return "Calabresa";
    }
}
