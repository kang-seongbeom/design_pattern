package bridge;

public class Client {
    public static void main(String[] args){

        System.out.println("[로지택 리모컨]");
        RemoteControl control = new LogitechRemoteControl(new SamsungTv());
        control.nextChannel();
        control.nextChannel();

        control = new LogitechRemoteControl(new LGTv());
        control.nextChannel();

        System.out.println("[한성 리모컨]");
        control = new HansungRemoteControl(new SamsungTv());
        control.nextChannel();

        control = new HansungRemoteControl(new LGTv());
        control.nextChannel();
        control.nextChannel();
    }
}
