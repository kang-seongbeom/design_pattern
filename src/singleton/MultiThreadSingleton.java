package singleton;

public class MultiThreadSingleton {
    private volatile static MultiThreadSingleton singleton;

    public static MultiThreadSingleton getInstance(){
        if(singleton == null){
            synchronized (MultiThreadSingleton.class){
                if(singleton == null){
                    singleton = new MultiThreadSingleton();
                }
            }
        }
        return singleton;
    }
}
