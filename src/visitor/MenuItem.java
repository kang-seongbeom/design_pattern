package visitor;

// Leaf Node
public class MenuItem extends MenuComponent {
    String name, description;
    int price;
    Visitor visitor;

    public MenuItem(String name, String description, int price, Visitor visitor) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.visitor = visitor;
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
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(name + "("+ description +")" + " : " +price);
    }
}
