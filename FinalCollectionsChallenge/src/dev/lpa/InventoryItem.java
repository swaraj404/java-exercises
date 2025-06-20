package dev.lpa;

public class InventoryItem {

    private Product product;
    private double price;
    private int qtyTotal;
    private int qtyReserved;
    private int qtyReorder;
    private int qtyLow;

    public InventoryItem(Product product, double price, int qtyTotal, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qtyTotal = qtyTotal;
        this.qtyLow = qtyLow;
        this.qtyReorder = qtyTotal;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public boolean reserveItem(int qty) {//function to reserve the item to purchase.

        if ((qtyTotal - qtyReserved) >= qty) {//Here it checks if the asked product is available in the given quantity or not.
            qtyReserved += qty;
            return true;
        }
        return false;
    }

    public void releaseItem(int qty) {//function to remove the item from the reserved list or to decrease the quantity
        qtyReserved -= qty;
    }

    public boolean sellItem(int qty) {

        if (qtyTotal >= qty) {
            qtyTotal -= qty;
            qtyReserved -= qty;
            if (qtyTotal <= qtyLow) {
                placeInventoryOrder();
            }
            return true;
        }
        return false;
    }

    private void placeInventoryOrder() {
        System.out.printf("Ordering qty %d : %s%n", qtyReorder, product);
    }

    @Override
    public String toString() {
        return "%s, $%.2f : [%04d,% 2d]".formatted(product, price, qtyTotal,
                qtyReserved);
    }
}
