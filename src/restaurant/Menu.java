package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Calendar dateLastUpdated = new GregorianCalendar(2000, 1, 1);

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    

    public Calendar getDateLastUpdated() {

        for (MenuItem item : menuItems){
            if (item.getDateAdded().compareTo(dateLastUpdated) > 0) {
                dateLastUpdated = item.getDateAdded();
            }
        }
        System.out.println(dateLastUpdated);

        return dateLastUpdated;
    }
}
