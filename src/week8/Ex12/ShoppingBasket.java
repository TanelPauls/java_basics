package week8.Ex12;

import week7.Book_Search_through_HashMap.Book;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> shoppingBasket = new HashMap<>();

    public void add(String product, int price){
        if(shoppingBasket.containsKey(product)){
            shoppingBasket.get(product).increaseAmount();
        } else{
            this.shoppingBasket.put(product, new Purchase(product, 1, price));
        }

    }
    public int price(){
        int total = 0;
        for (Purchase purchase : shoppingBasket.values()) {
            total += purchase.price();
        }
        return total;
    }
    public void print(){
        for (Purchase purchase : shoppingBasket.values()) {
            System.out.println(purchase.toString());
        }
    }

}
