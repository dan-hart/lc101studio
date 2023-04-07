package Restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = Calendar.getInstance().getTime();
        this.items = new ArrayList<>();
    }

    public Menu(Date dateUpdated, ArrayList<MenuItem> item) {
        this.lastUpdated = dateUpdated;
        this.items = item;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.setLastUpdated(Calendar.getInstance().getTime());
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        if (this.items.contains(item)) {
            // System.out.println(item.getDescription() + " is already on the menu!");
        } else {
            this.items.add(item);
            this.setLastUpdated(Calendar.getInstance().getTime());
        }
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for(int i = 0; i < items.size(); i ++) {
            if (items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }

        this.items.remove(toBeRemoved);
        this.setLastUpdated(Calendar.getInstance().getTime());
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was last updated on " + this.lastUpdated);
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

    public void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getDescription());
        }
    }

    public String[] getLineItemList(boolean printLineItems) {
        String[] lineItems = new String[items.size()];
        for (int i = 0; i < items.size(); i++) {
            lineItems[i] = items.get(i).getLineItem();
            if (printLineItems) {
                System.out.println(lineItems[i]);
            }
        }
        return lineItems;
    }
}
