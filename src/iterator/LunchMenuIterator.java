package iterator;

import java.util.List;

public class LunchMenuIterator implements MenuIterator {
    List<MenuItem> menuItems;
    int pos = 0;

    public LunchMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(pos>= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(pos++);
    }
}
