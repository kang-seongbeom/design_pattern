package bridge;

public class LogitechRemoteControl extends RemoteControl{
    private int currentChannel = 1;

    public LogitechRemoteControl(Tv tv) {
        super(tv);
    }

    public void nextChannel(){
        setChannel(currentChannel++);
    }
}
