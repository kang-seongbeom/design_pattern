package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Behavior> list = new ArrayList<>();

    public void addBehavior(Behavior behavior){
        list.add(behavior);
    }

    public void onEvent(String from, String event){
        Behavior behavior;
        if(from.equals("아침 ")){
            behavior = list.get(1);
            behavior.receiveBehavior(from, behavior.getBehavior() + " " + event);
        }else{
            behavior = list.get(0);
            behavior.receiveBehavior(from, behavior.getBehavior() + " " +event);
        }
    }
}
