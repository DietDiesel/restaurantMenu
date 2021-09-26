package restaurant;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestMain {
    public static void main(String[] args) {
        String newItemName = "Cheeseburger Pizza";
        String newItemCategory = "Specialty Pizzas";
        String newItemDesc = "Classic pizza topped with beef, shredded American cheese, sliced deli pickles, onions, and mustard.";
        double newItemPrice = 14.95;
        MenuItem menuItemCbPizza = new MenuItem(newItemName, newItemCategory, newItemDesc, newItemPrice);

        newItemName = "Megan's Excitingly Delicious Pizza";
        newItemCategory = "Ideal Pizzas";
        newItemDesc = "The finest, freshest ingredients, expertly baked into one of best flavor experiences of your life.";
        newItemPrice = 14.95;
        MenuItem menuItemMbPizza = new MenuItem(newItemName, newItemCategory, newItemDesc, newItemPrice);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Menu notMinskysPizzaMenu = new Menu();

        System.out.println(menuItemCbPizza.getDateAdded().compareTo(menuItemMbPizza.getDateAdded()));
        System.out.println(notMinskysPizzaMenu.getDateLastUpdated());
    }
}
