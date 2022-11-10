package command.commander;

import command.Command;
import command.reciver.LightOnReceiver;
import command.reciver.Receiver;

public class LightOnCommand implements Command {
    Receiver light;

    public LightOnCommand(Receiver lightOn){
        this.light = lightOn;
    }

    @Override
    public void execute() {
        light.action();
    }
}
