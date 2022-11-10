package observer;

public class Main {
    public static void main(String[] args){
        Child child = new Child();

        // 엄마에게만 알림
        Mother mom = new Mother(child);
        child.setValue(100);

        child.removeObserver(mom);
        System.out.println("---------");

        // 아빠에게만 알림
        Father dad = new Father(child);
        child.setValue(70);

        child.removeObserver(dad);
        System.out.println("---------");

        // 엄마, 아빠에게 알림
        mom = new Mother(child);
        dad = new Father(child);
        child.setValue(70);
    }
}
