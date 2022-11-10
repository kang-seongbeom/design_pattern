package command;

public class RemoteControllerInvoker {
    private final int count = 2;

    Command[] onCommand;
    Command[] offCommand;

    public RemoteControllerInvoker() {
        onCommand = new Command[count];
        offCommand = new Command[count];
    }

    public void setCommand(int slot, Command on, Command off){
        this.onCommand[slot] = on;
        this.offCommand[slot] = off;
    }

    public void pressOnButton(int slot){
        this.onCommand[slot].execute();
    }

    public void pressOffButton(int slot){
        this.offCommand[slot].execute();
    }
}
