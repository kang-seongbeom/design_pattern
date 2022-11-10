package command.commander;

import command.Command;
import command.reciver.LightOffReceiver;
import command.reciver.Receiver;

public class LightOffCommand implements Command {
    Receiver light;

    public LightOffCommand(Receiver light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.action();
    }
}
