package iterator;

public class DinnerMenuIterator implements MenuIterator {
    MenuItem[] menuItems;
    int pos = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(pos>= menuItems.length || menuItems[pos] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return menuItems[pos++];
    }
}
