package observer;

public class Father implements Observer, Display{
    private Subject subject;
    private int value;

    public Father(Subject subject) {
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
        System.out.println("아빠 : "+this.value);
    }
}


