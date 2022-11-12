package prototype;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements Cloneable{

    private List<String> list;

    public Monsters(){
        list = new ArrayList<>();
    }

    public Monsters(List<String> list) {
        this.list = list;
    }

    public List<String> getList(){
        return list;
    }

    public void loadData(){
        list.add("ghost");
        list.add("zombie");
        list.add("skeleton");
    }

    public void print(){
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> copy = new ArrayList<>(list);
        return new Monsters(copy);
    }
}
