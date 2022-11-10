package factorymethod;

public abstract class Pizza {
    String description;

    void getDescription(){
        System.out.println(this.description);
    }
}
