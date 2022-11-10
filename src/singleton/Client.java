package singleton;

public class Client {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        isSingleton(singleton1, singleton2);

        singleton2 = new Singleton();
        isSingleton(singleton1, singleton2);

    }

    private static boolean isSingleton(Object o1, Object o2) {
        if (o1 == o2) {
            System.out.println("싱글톤 입니다.");
            return true;
        }
        System.out.println("싱글톤 아닙니다.");
        return false;
    }
}
