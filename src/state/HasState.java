package state;

public class HasState implements State{
    GumballMachine machine;

    public HasState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("이미 동전이 기계에 있어 넣을 수 없습니다.");
    }

    @Override
    public void eject() {
        System.out.println("동전을 반환합니다.");
        machine.setState(machine.no);
    }

    @Override
    public void turn() {
        System.out.println("손잡이를 돌렸습니다");
        machine.setState(machine.sold);
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다. 손잡이를 돌려주세요.");
    }
}
