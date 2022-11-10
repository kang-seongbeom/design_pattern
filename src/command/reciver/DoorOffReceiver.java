package command.reciver;

public class DoorOffReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("문이 닫혔습니다.");
    }
}
