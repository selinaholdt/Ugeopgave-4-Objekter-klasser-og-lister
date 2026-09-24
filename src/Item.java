public class Item {
    private String name;
    private int value;
    private String type;
    private static int totalItemsCreated = 0;
    private static int totalValue = 0;  // For ekstra udfordring

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated = totalItemsCreated + 1;
        totalValue = totalValue + value;  // For ekstra udfordring
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public static double getAverageItemValue() {
        if (totalItemsCreated == 0) {
            return 0;
        }
        return (double)totalValue / totalItemsCreated;
    }

    public String toString() {
        return name + " (" + type + ") - " + value + " gold";
    }



}
