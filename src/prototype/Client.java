package prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Monsters monsters = new Monsters();
        monsters.loadData();

        Monsters upMonster = (Monsters) monsters.clone();
        Monsters downMonster = (Monsters) monsters.clone();

        upMonster.getList().add("night");
        downMonster.getList().remove(0);

        monsters.print();
        System.out.println("\n------");
        upMonster.print();
        System.out.println("\n------");
        downMonster.print();
        System.out.println("\n------");
    }
}
