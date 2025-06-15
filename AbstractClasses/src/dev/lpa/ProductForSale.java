package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    private double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
public double getSalePrice(int qty){
        return qty*price;
}

public void printPricedItem(int qty){
        System.out.printf("%2d qty at $%8.2f each, %-15 %-35s 5---",qty,price,type,description);

}
public Abstract  abstract void showDetails();

}
