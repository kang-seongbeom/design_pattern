package iterator;

import java.util.List;

public class LunchMenu {
    List<MenuItem> menuItems = List.of(
            new MenuItem("팬케이크", 100),
            new MenuItem("와플", 200),
            new MenuItem("팬케이크+와플", 250),
            new MenuItem("딸기 요거트", 50)
    );

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuIterator createIterator(){
        return new LunchMenuIterator(menuItems);
    }
}
