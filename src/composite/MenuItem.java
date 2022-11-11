package composite;

// Leaf Node
public class MenuItem extends MenuComponent{
    String name, description;
    int price;

    public MenuItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
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
