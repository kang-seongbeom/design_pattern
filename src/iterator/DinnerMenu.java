package iterator;

public class DinnerMenu {
    MenuItem[] menuItems = new MenuItem[]{
            new MenuItem("불고기", 300),
            new MenuItem("비빔밥", 200),
            new MenuItem("식혜", 30),
    };

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public MenuIterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

}
