package command.reciver;

public class LightOnReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("불이 켜졌습니다.");
    }
}
