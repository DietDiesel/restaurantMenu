package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date dateLastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public Date getDateLastUpdated() {
        for (MenuItem item : menuItems){
            if (dateLastUpdated.compareTo(menuItems(item).getDateAdded) < 7) {
                dateLastUpdated = menuItems(item).getDateAdded;
            }
        }
        return dateLastUpdated;
    }



}
