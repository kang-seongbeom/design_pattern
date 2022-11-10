package adapter;

public class Client {
    public static void main(String[] args){

        Duck mallard = new MallardDuck();
        mallard.quack();

        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
