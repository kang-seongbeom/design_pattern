package abstractfactory;

public class Client {
    public static void main(String[] args){

        PizzaStore seoul = new SeoulPizzaStore();

        System.out.println("------");

        PizzaStore jeju = new JejuPizzaStore();
    }
}
