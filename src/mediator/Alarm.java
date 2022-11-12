package mediator;

public interface Alarm {
    void setMediator(Mediator mediator);
    void eventOccur(String event);
}
