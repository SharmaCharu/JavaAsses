package commerce;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	Product product = new Product();
    private int ch = 0;
    
    public UserInterface () {
        menu();
    }
    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display choosed product");
        System.out.println("0. Exit");
    }
    public void menu () {
        do {
            startScreen();
            getUserInput();
            
            switch (ch) {
                case 1: 
                    displayStoreProducts();
                    
                    break;
                    
                case 0:
                	System.exit(0);
                	break;
                	
                default:
                	
                	break;
                	
            }while(ch != 0);
            
        }
        
        private void displayStoreProducts() {
            List<Product> products = new Products().getProducts();
            
    
   