package mediator;

public class Client {
    public static void main(String[] args){
        Mediator mediator = new Mediator();

        Alarm morning = new MorningAlarm();
        morning.setMediator(mediator);
        Alarm night = new NightAlarm();
        night.setMediator(mediator);

        mediator.addBehavior(new Walking());
        mediator.addBehavior(new Stretching());

        morning.eventOccur("[기상 후 습관]");
        night.eventOccur("[자기전 습관]");
    }
}
