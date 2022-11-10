package command.reciver;

public class LightOffReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("불이 꺼졌습니다.");
    }
}
