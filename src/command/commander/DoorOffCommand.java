package command.commander;

import command.Command;
import command.reciver.Receiver;

public class DoorOffCommand implements Command {
    Receiver door;

    public DoorOffCommand(Receiver door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.action();
    }
}
