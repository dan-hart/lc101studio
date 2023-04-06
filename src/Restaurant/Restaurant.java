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
        MenuItem newItem1 = new MenuItem(4.99, "Garlic linguine", "Dinner", true);
        MenuItem newItem2 = new MenuItem(6.99, "Really good steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(2.99, "Delicious wings", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();

        ourMenu.printItem(newItem2);

        ourMenu.removeItem(newItem2);

        ourMenu.printMenu();
    }

    Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void addMenuItem(MenuItem item) {
        this.menu.addItem(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.menu.removeItem(item);
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
