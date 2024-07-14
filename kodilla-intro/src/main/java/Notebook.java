public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1500 && this.year > 2018) {
            System.out.println("This is a profitable offer.");
        } else if (this.price > 1000 && this.price <= 1500 && this.year > 2016) {
            System.out.println("Offer to consider.");
        } else if (this.price < 1300 && this.year > 2016) {
            System.out.println("This not a profitable offer.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This notebook is very light.");
        } else if (this.weight <= 900) {
            System.out.println("The weight is good.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

}
