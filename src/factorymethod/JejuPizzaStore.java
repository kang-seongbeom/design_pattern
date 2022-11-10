package factorymethod;

public class JejuPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new JejuCheesePizza();
        }
        return new JejuPepperoniPizza();
    }
}
