package factorymethod;

public class Client {
    public static void main(String[] args){

        PizzaStore seoul = new SeoulPizzaStore();
        seoul.orderPizza("cheese").getDescription();
        seoul.orderPizza("pepperoni").getDescription();;

        System.out.println("------");

        PizzaStore jeju = new JejuPizzaStore();
        jeju.orderPizza("cheese").getDescription();;
        jeju.orderPizza("pepperoni").getDescription();;
    }
}
