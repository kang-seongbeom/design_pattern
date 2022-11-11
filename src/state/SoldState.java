package state;

public class SoldState implements State{
    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("알맹이를 내보내고 있어 동전을 집어넣을 수 없습니다.");
    }

    @Override
    public void eject() {
        System.out.println("알맹이가 뽑히고 있어 동전을 반환할 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("손잡이는 한 번만 돌려주세요.");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if(machine.count > 0){
            machine.setState(machine.no);
        }else{
            System.out.println("알맹이가 매진되었습니다.");
            machine.setState(machine.soldOut);
        }
    }
}
