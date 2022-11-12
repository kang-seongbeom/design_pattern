package flyweight;

public class Tree {
    int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display(){
        System.out.println("------");
        System.out.println("x좌표 : " + x);
        System.out.println("y좌표 : " + y);
    }
}
