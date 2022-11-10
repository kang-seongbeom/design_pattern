package command.reciver;

public class DoorOnReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("문이 열렸습니다.");
    }
}
