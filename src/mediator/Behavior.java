package mediator;

public interface Behavior {
    void receiveBehavior(String from, String event);
    String getBehavior();
}
