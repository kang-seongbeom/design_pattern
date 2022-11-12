package mediator;

public class NightAlarm implements Alarm{
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void eventOccur(String event) {
        mediator.onEvent("저녁 ", event);
    }
}
