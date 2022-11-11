package bridge;

public class HansungRemoteControl extends RemoteControl{
    private int currentChannel = 1;

    public HansungRemoteControl(Tv tv) {
        super(tv);
    }

    public void nextChannel(){
        setChannel(currentChannel++);
    }
}
