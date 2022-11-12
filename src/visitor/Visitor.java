package visitor;

public class Visitor {
    private int depth = 0;

    public void getDepth(){
        System.out.println("------ depth : " + (depth++) + " ------");
    }
}
