package SuperMarketStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Supermarket {
    Scanner input = new Scanner(System.in);

    private ArrayList<Product> products;
    private HashMap<String,ArrayList<Product>> category;
    private HashSet<Product> favproduct;


    public Supermarket(){
        this.products = new ArrayList<>();
        this.category = new HashMap<>();
        this.favproduct = new HashSet<>();

    }

    public void registerProduct(Product product){
        products.add(product);
    }

    public void addFavorite(Product favProduct){
        this.favproduct.add(favProduct);
    }


    public void addToCategory(Product categoryProduct, String key){
        if(!category.containsKey(key)){
            ArrayList<Product> newProduct = new ArrayList<>();
            newProduct.add(categoryProduct);
            category.put(key,newProduct);
        }else{//Add else

        }

    }


    public double getTotalPrice(){

        double sum = 0.0;

        for (Product prod : products) {

            sum += prod.getPrice();

        }return sum;
    }


    public double getAverageTotal(){

        double sumA = getTotalPrice()/products.size();

        return sumA;

    }


    public Product getCheapest(){

        Product cheapestProduct = null;
        double cheapestValue = Double.MAX_VALUE;

        for (Product currentProduct : products) {

            if( currentProduct.getPrice() < cheapestValue){

                cheapestValue = currentProduct.getPrice();
                cheapestProduct = currentProduct;
            }
        }return cheapestProduct;
    }



    public void getfavoriteProducts(){

        favproduct.toString();
    }


    public void getCategoryProducts(){

        category.toString();
    }

    public Product getProducts(int position) {
        return this.products.get(position);
    }

    public HashMap<String, ArrayList<Product>> getCategory() {
        return category;
    }

    public HashSet<Product> getFavproduct() {
        return favproduct;
    }


    public String toString() {

        String info = "Products: "+this.products.toString()+"\n";
        info += "Favorite Products: "+this.favproduct.toString()+"\n";
        info += "Category Products: "+this.category.toString();

        return info;
    }


    public void removeProduct(int position){

        products.remove(position);
    }


    public boolean sameProductName(String existingProduct){

        for ( Product anotherProduct : products) {

            if(existingProduct.equalsIgnoreCase(anotherProduct.getName())){

                return true;
            }

        }return false;
    }


    public boolean sameProduct(Product existingProduct){

        for ( Product anotherProduct : products) {

            if(existingProduct.equals(anotherProduct)) {
                return true;
            }
        } return false;
    }


    public void setNameProduct(String existingProduct, double newPrice){

        for ( Product anotherProduct : products) {

            if(existingProduct.equalsIgnoreCase(anotherProduct.getName())){

                anotherProduct.setPrice(newPrice);

            }
        }
    }



}



