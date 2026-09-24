public class Product {
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo() {
        System.out.println("Product: " + name + ", price: " + price);
        System.out.println("Tags: ");
        for (int i = 0; i < tags.length; i++){
            System.out.println(tags[i]);
            if (i < tags.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println();
    }

    public boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    double getPrice(){
        return price;
    }





}
