package observer;

public class Mother implements Observer, Display{
    private Subject subject;
    private int value;

    public Mother(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    @Override
    public void display() {
        System.out.println("엄마 : "+this.value);
    }
}


