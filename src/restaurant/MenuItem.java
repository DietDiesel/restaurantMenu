package restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private Calendar dateAdded;
    private boolean newItem;

    public MenuItem(String newItemName, String newItemCategory, String newItemDesc, double newItemPrice) {
        this.name = newItemName;
        this.category = newItemCategory;
        this.description = newItemDesc;
        this.price = newItemPrice;
        this.dateAdded = Calendar.getInstance();
        // TODO find a way to set a date relative to "now"
    }

    public MenuItem(String newItemName, String newItemCategory, String newItemDesc, double newItemPrice, Calendar dateAdded) {
        this.name = newItemName;
        this.category = newItemCategory;
        this.description = newItemDesc;
        this.price = newItemPrice;
        this.dateAdded = dateAdded;
    }

    public String getName(){return this.name;}
    public String getCategory(){return this.category;}
    public String getDesc(){return this.description;}
    public double getPrice(){return this.price;}
    public Calendar getDateAdded(){return this.dateAdded;}

    public void setName(String newName){this.name = newName;}
    public void setCategory(String newCat){this.category = newCat;}
    public void setDesc(String newDesc){this.description = newDesc;}
    public void setPrice(double newPrice){this.price = newPrice;}
}
