package builders;

public class Director {

    public Director() {
    }

    public void makePizza(PizzaBuilder builder){
        String sabor = builder.getTipo();

        switch (sabor) {
            case "Calabresa":
                builder.reset();
                builder.setQueijo();
                builder.setCalabresa();
                builder.setCebola();

                System.out.println("Pizza: " + builder.getPizza());
                break;

            case "Catupiry":
                builder.reset();
                builder.setCatupiry();

                System.out.println("Pizza: " + builder.getPizza());

                break;

            case "Pepperoni":
                builder.setQueijo();
                builder.setPepperoni();

                System.out.println("Pizza: " + builder.getPizza());

                break;

        }

    }

}
