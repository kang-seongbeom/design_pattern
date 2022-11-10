package command.commander;

import command.Command;
import command.reciver.DoorOnReceiver;
import command.reciver.Receiver;

public class DoorOnCommand implements Command {
    Receiver door;

    public DoorOnCommand(Receiver door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.action();
    }
}
