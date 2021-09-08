package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private Date dateAdded;
    private boolean newItem;

    public boolean createNewMenuItem(String newItemName, String newItemCategory, String newItemDesc, double newItemPrice) {
        this.name = newItemName;
        this.category = newItemCategory;
        this.description = newItemDesc;
        this.price = newItemPrice;
        this.dateAdded = new Date();
        return true;
    }

    public String getName(){return this.name;}
    public String getCategory(){return this.category;}
    public String getDesc(){return this.description;}
    public double getPrice(){return this.price;}
    public Date getDateAdded(){return this.dateAdded;}

    public void setName(String newName){this.name = newName;}
    public void setCategory(String newCat){this.category = newCat;}
    public void setDesc(String newDesc){this.description = newDesc;}
    public void setPrice(double newPrice){this.price = newPrice;}
}
