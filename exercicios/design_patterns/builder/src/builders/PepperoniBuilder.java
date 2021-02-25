package builders;

public class PepperoniBuilder implements PizzaBuilder{

    private PepperoniBuilder pizza = this;

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
        this.pizza = new PepperoniBuilder();

    }

    @Override public PizzaBuilder getPizza() {
        PepperoniBuilder product = this.pizza;
        this.reset();
        return product;
    }

    @Override public String getTipo() {
        return "Pepperoni";
    }
}
