package state;

public class Client {
    public static void main(String[] args){
        GumballMachine machine = new GumballMachine(3);

        machine.insert();
        machine.eject();

        for(int i=0; i<3; i++) {
            System.out.println("------");
            machine.insert();
            machine.turn();
        }

        System.out.println("------");
        machine.insert();
    }
}
