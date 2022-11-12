package memento;

public class Client {
    public static void main(String[] args){
        Game game = new Game();

        System.out.println(game.tmpAddMoney(200));

        System.out.println(game.restore().money);
    }
}
