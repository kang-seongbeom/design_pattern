package state;

public class SoldOutState implements State{
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("알맹이가 매진되어 동전을 넣어도 뽑을 수 없습니다.");
    }

    @Override
    public void eject() {
        System.out.println("알맹이가 매진되었고, 삽입된 동전이 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("알맹이가 매진되어 돌릴 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 매진되어 뽑을 수 없습니다.");
    }
}
