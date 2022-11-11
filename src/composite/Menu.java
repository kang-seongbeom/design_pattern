package composite;

import java.util.ArrayList;
import java.util.List;

// Node
public class Menu extends MenuComponent{
    List<MenuComponent> component = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        component.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        component.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return component.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("["+name+"]" + "("+ description +")");

        for (MenuComponent menuComponent : component) {
            menuComponent.print();
        }
    }
}
