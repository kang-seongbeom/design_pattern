package bridge;

public abstract class RemoteControl {
    protected Tv tv;

    protected RemoteControl(Tv tv){
        this.tv = tv;
    }

    protected abstract void nextChannel();

    public void setChannel(int channel){
        System.out.println(tv.tuneChannel(channel));
    }
}
