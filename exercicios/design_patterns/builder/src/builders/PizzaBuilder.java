package builders;

public interface PizzaBuilder {
    public void setQueijo();
    public void setCatupiry();
    public void setCalabresa();
    public void setCebola();
    public void setPepperoni();
    public void reset();
    public PizzaBuilder getPizza();
    public String getTipo();

}
