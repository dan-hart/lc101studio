package Restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Restaurant {
    /*
    Create several items and add them to a menu.
    Print the entire, updated menu to the screen.
    Print an individual menu item to the screen.
    Delete an item from a menu, then reprint the menu.
     */
    public static void main(String[] args) {
        // Get 20 menu items in for loop
        Menu startingMenu = new Menu();
        for (int i = 0; i < 20; i++) {
            startingMenu.addItem(new MenuItem());
        }
        Restaurant ourRestaurant = new Restaurant(startingMenu);

        System.out.println("Our restaurant's menu:");
        ourRestaurant.getMenu().getLineItemList(true);
    }

    Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean addMenuItem(MenuItem item) {
        if (this.menu.getItems().contains(item)) {
            // System.out.println(item.getDescription() + " is already on the menu!");
            return false;
        } else {
            this.menu.addItem(item);
            return true;
        }
    }

    public void removeMenuItem(MenuItem item) {
        if (this.menu.getItems().contains(item)) {
            this.menu.removeItem(item);
        } else {
            // System.out.println("That item is not on the menu!");
        }
    }

    public Restaurant() {
        this.menu = new Menu(Calendar.getInstance().getTime(), new ArrayList<>());
    }

    public Restaurant(Menu menu) {
        this.menu = menu;
    }

    public Restaurant(ArrayList<MenuItem> items) {
        this.menu = new Menu(Calendar.getInstance().getTime(), items);
    }
}
