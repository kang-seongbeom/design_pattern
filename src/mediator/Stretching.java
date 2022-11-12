package mediator;

public class Stretching implements Behavior {

    public String behavior = "스트레칭";

    @Override
    public void receiveBehavior(String from, String event) {
        System.out.println(from + event);
    }

    @Override
    public String getBehavior() {
        return behavior;
    }
}
