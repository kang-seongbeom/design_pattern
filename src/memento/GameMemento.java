package memento;

public class GameMemento {
    int hp, mp, money;

    public GameMemento(int hp, int mp, int money) {
        this.hp = hp;
        this.mp = mp;
        this.money = money;
    }

    public GameMemento restore(){
        return this;
    }
}
