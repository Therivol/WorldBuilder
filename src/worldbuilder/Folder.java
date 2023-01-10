package worldbuilder;

import java.util.HashMap;

public class Folder extends Item {

    private final HashMap<String, Item> items;

    public Folder(String title) {
        items = new HashMap<>();
        this.title = title;
    }

    public void addItem(Item item) {
        items.put(item.getTitle(), item);
    }

    public void removeItem(String itemTitle) {
        items.remove(itemTitle);
    }

    public Item getItem(String title) {
        return items.get(title);
    }

}
