import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName, int maxCapacity) {
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < maxCapacity) {
            items.add(item);
            System.out.println(playerName + " picked up: " + item.getName());
        } else {
            System.out.println("Inventory fuld! Kan ikke tilføje " + item.getName());
        }
    }

    public int getTotalValue() {
        int total = 0;
        for (Item item : items) {
            total = total + item.getValue();
        }
        return total;
    }

    public ArrayList<Item> findItemsByType(String type) {
        ArrayList<Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getType().equalsIgnoreCase(type)) {
                found.add(item);
            }
        }
        return found;
    }

    public void printInventory() {
        System.out.println("\n=== " + playerName + "'s Inventory ===");
        System.out.println("Capacity: " + items.size() + "/" + maxCapacity);
        for (Item item : items) {
            System.out.println("- " + item);
        }
        System.out.println("Total value: " + getTotalValue() + " gold");
    }


}
