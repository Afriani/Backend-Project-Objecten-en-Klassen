package Supermarket;

public class SupermarketMain {
    public static void main(String[] args) {
        Store store = new Store(15, 25, 5);
        System.out.println();
        System.out.println("Stocks");
        System.out.println(store);

        System.out.println();
        System.out.println("Producten toegevoegd");
        store.addProduct("Cola", 10);
        store.addProduct("Candles", 5);
        store.addProduct("Rice", 0);

        System.out.println();
        System.out.println("Verkochte producten");
        store.sellProduct("Cola", 7);
        store.sellProduct("Candles", 5);
        store.sellProduct("Rice", 13);

        System.out.println();
        System.out.println("Huidige voorraad");
        store.checkStock();
    }

}
