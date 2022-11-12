package mediator;

public class Walking implements Behavior {

    public String behavior = "걷기";

    @Override
    public void receiveBehavior(String from, String event) {
        System.out.println(from + event);
    }

    @Override
    public String getBehavior() {
        return behavior;
    }
}
