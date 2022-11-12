package memento;

public class Game {

    GameMemento memento;

    public Game() {
        memento = new GameMemento(100, 100, 0);
    }

    public int tmpAddMoney(int money){
        return memento.money + money;
    }

    public GameMemento restore(){
        return memento.restore();
    }
}
