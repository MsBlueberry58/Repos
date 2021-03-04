package builders;

public class CatupiryBuilder implements PizzaBuilder {

    private CatupiryBuilder pizza = this;

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
        this.pizza = new CatupiryBuilder();

    }

    @Override public PizzaBuilder getPizza() {
        CatupiryBuilder product = this.pizza;
        this.reset();
        return product;
    }

    @Override public String getTipo() {
        return "Catupiry";
    }
}
