package factorymethod;

public class SeoulPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new SeoulCheesePizza();
        }
        return new SeoulPepperoniPizza();
    }
}
