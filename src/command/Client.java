package command;

import command.commander.*;
import command.reciver.*;

public class Client {
    static Command lightOnCommand;
    static Command lightOffCommand;
    static Command doorOnCommand;
    static Command doorOffCommand;

    static RemoteControllerInvoker invoker;

    public static void main(String[] args){

        initSetting();

        // 조명
        invoker.pressOnButton(0);
        invoker.pressOffButton(0);

        // 문
        invoker.pressOnButton(1);
        invoker.pressOffButton(1);
    }

    private static void initSetting(){
        // 각 커맨드마다 동작할 리시버 할당
        lightOnCommand = new LightOnCommand(new LightOnReceiver());
        lightOffCommand = new LightOffCommand(new LightOffReceiver());
        doorOnCommand = new DoorOnCommand(new DoorOnReceiver());
        doorOffCommand = new DoorOffCommand(new DoorOffReceiver());

        invoker = new RemoteControllerInvoker();
        invoker.setCommand(0, lightOnCommand, lightOffCommand);
        invoker.setCommand(1, doorOnCommand, doorOffCommand);
    }
}
