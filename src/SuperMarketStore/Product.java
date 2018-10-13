package SuperMarketStore;

public class Product {

    private String name;
    private double price;


    public Product(String name, double price){

        this.name = name;
        this.price = price;

    }

    public boolean equals(Object obj) {

        if(obj instanceof Product){

            Product anotherProduct = (Product) obj;
            boolean sameName = this.getName().equals(anotherProduct.getName());
            boolean samePrice = this.getPrice() == anotherProduct.getPrice();

            return sameName && samePrice;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        String result = this.name+": "+this.price+" SEK";

        return result;
    }
}


