import java.util.ArrayList;

public class Main {

    void main() {
        //Opgave 1: Student klasse
        System.out.println("====== OPGAVE 1 ======");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Camilla", 20));
        students.add(new Student("Casper", 22));
        students.add(new Student("Sofie", 21));

        int max = 0;
        for (Student student : students) {
            student.printInfo();
            if (student.age > max) {
                max = student.age;
            }
        }
        System.out.println("Oldest student is: " + max);

        //Opgave 2: Product klasse
        System.out.println();
        System.out.println("====== OPGAVE 2 ======");
        Product product1 = new Product("T-shirt", 49.95, new String[]{"Clothes", "Sale"});
        Product product2 = new Product("Pants", 129.50, new String[]{"Clothes", "New"});
        Product product3 = new Product("Boots", 399.95, new String[]{"Shoes", "Sale", "New"});
        Product product4 = new Product("Cap", 39.00, new String[]{"Accessories"});

        Product[] products = {product1, product2, product3, product4};

        for (Product p : products) {
            if (p.hasTag("sale")) {
                p.printInfo();
            }
        }

        Product mostExpensive = products[0];
        for (Product p : products) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        System.out.println("Most expensive item: " + mostExpensive.price);


        //Opgave 3: BankAccount med ArrayList
        System.out.println();
        System.out.println("====== OPGAVE 3 ======");
        BankAccount account = new BankAccount("Birgit", 1500);

        account.deposit(200);
        account.deposit(300);
        account.deposit(1000);
        account.withdraw(400);
        account.withdraw(200);
        account.deposit(200);

        account.printTransactionHistory();

        System.out.println("Nuværende saldo: " + account.getBalance() + " kr");


        //Opgave 4: Team Management System
        System.out.println();
        System.out.println("====== OPGAVE 4 ======");
        Team redTeam = new Team("Røde Dragoner");
        Team blueTeam = new Team("Blå Hajer");

        // Tilføj spillere til rødt hold
        redTeam.addPlayer(new Player("Anna", 85));
        redTeam.addPlayer(new Player("Peter", 72));
        redTeam.addPlayer(new Player("Maria", 90));

        // Tilføj spillere til blåt hold
        blueTeam.addPlayer(new Player("Lars", 78));
        blueTeam.addPlayer(new Player("Emma", 82));
        blueTeam.addPlayer(new Player("Simon", 88));
        blueTeam.addPlayer(new Player("Sofia", 75));

        // Print teams
        redTeam.printTeam();
        blueTeam.printTeam();

        // Konkurrence
        redTeam.compete(blueTeam);


        //Opgave 5: Library System med Access Modifiers
        System.out.println();
        System.out.println("====== OPGAVE 5 ======");
        Library library = new Library("Københavns Bibliotek");

        // Tilføj bøger
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("Ringenes Herre", "J.R.R. Tolkien"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen"));

        // Lån nogle bøger
        System.out.println("\n--- Lån bøger ---");
        Book book1 = library.findBookByTitle("1984");
        if (book1 != null) {
            book1.borrow();
        }

        Book book2 = library.findBookByTitle("Harry Potter");
        if (book2 != null) {
            book2.borrow();
        }

        // Find tilgængelige bøger
        System.out.println("\n--- Tilgængelige bøger ---");
        ArrayList<Book> available = library.findAvailableBooks();
        for (Book book : available) {
            System.out.println("- " + book);
        }

        // Return bog
        System.out.println("\n--- Return book ---");
        if (book1 != null) {
            book1.returnBook();
        }

        // Print alle bøger
        library.printAllBooks();

        // Test at private fields ikke kan tilgås
        // book1.available = true;  // FEJL! available er private
        // System.out.println(book1.title);  // FEJL! title er private


        //Opgave 6: Game Inventory med Static
        System.out.println();
        System.out.println("====== OPGAVE 6 ======");
        // Opret to spillere med inventories
        Inventory player1 = new Inventory("Hero", 10);
        Inventory player2 = new Inventory("Warrior", 8);

        // Tilføj items til spiller 1
        player1.addItem(new Item("Iron Sword", 150, "weapon"));
        player1.addItem(new Item("Health Potion", 50, "potion"));
        player1.addItem(new Item("Wooden Shield", 100, "armor"));
        player1.addItem(new Item("Mana Potion", 75, "potion"));

        // Tilføj items til spiller 2
        player2.addItem(new Item("Steel Axe", 200, "weapon"));
        player2.addItem(new Item("Leather Armor", 180, "armor"));
        player2.addItem(new Item("Health Potion", 50, "potion"));

        // Print inventories
        player1.printInventory();
        player2.printInventory();

        // Print total items created (STATIC metode)
        System.out.println("\n=== Game Statistics ===");
        System.out.println("Total items created: " + Item.getTotalItemsCreated());
        System.out.println("Average item value: " + Item.getAverageItemValue() + " gold");

        // Find items by type
        System.out.println("\n=== Hero's Potions ===");
        ArrayList<Item> potions = player1.findItemsByType("potion");
        for (Item potion : potions) {
            System.out.println("- " + potion);
        }
    }
}
