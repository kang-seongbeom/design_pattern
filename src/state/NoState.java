package state;

public class NoState implements State{
    GumballMachine machine;

    public NoState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("동전을 넣었습니다.");
        machine.setState(machine.has);
    }

    @Override
    public void eject() {
        System.out.println("동전이 없어 동전을 뺄 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("동전이 없어 기계를 돌릴 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("동전이 없어 알맹이를 뽑을 수 없습니다.");
    }
}
