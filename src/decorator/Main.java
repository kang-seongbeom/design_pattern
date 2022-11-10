package decorator;

public class Main {
    public static void main(String[] args){

        Beverage coffee = new Coffee();
        coffee = new MochaAdditive(new ShotAdditive(new ShotAdditive(coffee)));

        System.out.println("[주문]");
        System.out.println(coffee.getDescription());
        System.out.println("-------");
        System.out.println("[가격]\n" + coffee.cost());
    }
}
