package SuperMarketStore;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStore {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Supermarket store = new Supermarket();

        System.out.println("Enter a product name");
        String name = input.nextLine();
        System.out.println("enter price");
        double price = input.nextDouble();
        ArrayList<Product> products = new ArrayList<>();

        System.out.println(products.equals(products));






    }
}
