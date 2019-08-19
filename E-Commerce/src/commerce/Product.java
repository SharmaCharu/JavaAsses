package commerce;

import java.awt.List;
import java.util.ArrayList;

public class Product {

	private final ArrayList<Product> products = new ArrayList<Product>();

    public Product(int i, String string, Double double1, Integer integer) {
		// TODO Auto-generated constructor stub
	}

	public Product () {
        this.initStoreItems();
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"Lux Soap", "Fair n Lovely", "MTR"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d};
        Integer [] stock = {10, 6, 10};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}
