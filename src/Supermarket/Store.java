package Supermarket;

public class Store {
    private int colaAmount;
    private int candlesAmount;
    private int riceAmount;

    public Store(int colaAmount, int candlesAmount, int riceAmount) {
        this.colaAmount = colaAmount;
        this.candlesAmount = candlesAmount;
        this.riceAmount = riceAmount;
    }

    @Override
    public String toString() {
        return "Store{" +
                "colaAmount=" + colaAmount +
                ", candlesAmount=" + candlesAmount +
                ", riceAmount=" + riceAmount +
                '}';
    }

    // Voorraad toevoegen
    public void addProduct(String product, int amount) {
        switch (product.toLowerCase()) {
            case "cola":
                colaAmount += amount;
                System.out.println("Cola = " + amount);
                break;
            case "candles":
                candlesAmount += amount;
                System.out.println("Candles = " + amount);
                break;
            case "rice":
                riceAmount += amount;
                System.out.println("Rice (1kg verpakking) = " + amount);
                break;
            default:
                System.out.println("Onbekend product = " + product);
        }
    }

    // verkochten producten te kijken
    public void sellProduct(String product, int amount) {
        switch (product.toLowerCase()) {
            case "cola":
                if (colaAmount >= amount) {
                    colaAmount -= amount;
                    System.out.println("Cola = " + amount);
                } else {
                    System.out.println("Niet genoeg cola op voorraad.");
                }
                break;

            case "candles":
                if (candlesAmount >= amount) {
                    candlesAmount -= amount;
                    System.out.println("Candles = " + amount);
                } else {
                    System.out.println("Niet genoeg candles op voorraad.");
                }
                break;

            case "rice":
                if (riceAmount >= amount) {
                    riceAmount -= amount;
                    System.out.println("Rice (1kg verpakking) = " + amount);
                } else {
                    System.out.println("Niet genoeg rice op voorraad.");
                }
                break;
            default:
                System.out.println("Onbekend product = " + product);
        }
    }

    // huidige voorraad bekijken
    public void checkStock() {
        System.out.println("Cola = " + colaAmount);
        System.out.println("Candles = " + candlesAmount);
        System.out.println("rice (1kg verpakking) = " + riceAmount);
    }
}

