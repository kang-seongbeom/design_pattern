package mediator;

public class MorningAlarm implements Alarm{
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void eventOccur(String event) {
        mediator.onEvent("아침 ", event);
    }
}
