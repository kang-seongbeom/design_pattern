package strategy;

public class Client{
    public static void main(String[] args) {
        // 꽥 소리가 나는 행동을 사용하고 싶을 때
        QuackBehavior quackBehavior = new Quack();
        quackBehavior.quack(); // 꽥

        // 삑 소리가 나는 행동을 사용하고 싶을 때
        quackBehavior = new Squeck();
        quackBehavior.quack(); // 삑

        // 소리를 내고 싶지 않을 때
        quackBehavior = new MuteQuack();
        quackBehavior.quack(); // 소리를 내지 않음
    }
}