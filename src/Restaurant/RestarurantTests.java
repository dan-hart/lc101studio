package Restaurant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestarurantTests {
    @org.junit.jupiter.api.Test
    void testRestaurantConstructor() {
        Restaurant r = new Restaurant();
        assertEquals(0, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testRestaurantConstructorWithMenu() {
        Menu m = new Menu();
        Restaurant r = new Restaurant(m);
        assertEquals(0, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItem() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem();
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testRemoveMenuItem() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem();
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        r.removeMenuItem(newItem1);
        assertEquals(0, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemAlreadyExists() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem();
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testRemoveMenuItemDoesNotExist() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem();
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        MenuItem newItem2 = new MenuItem();
        r.removeMenuItem(newItem2);
        assertEquals(1, r.getMenu().getItems().size());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemWithDescription() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem(5.99, "Cheeseburger", "Entree", true);
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        assertEquals("Cheeseburger", r.getMenu().getItems().get(0).getDescription());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemWithPrice() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem(5.99, "Cheeseburger", "Entree", true);
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        assertEquals(5.99, r.getMenu().getItems().get(0).getPrice());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemWithCategory() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem(5.99, "Cheeseburger", "Entree", true);
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        assertEquals("Entree", r.getMenu().getItems().get(0).getCategory());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemWithIsNew() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem(5.99, "Cheeseburger", "Entree", true);
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        assertEquals(true, r.getMenu().getItems().get(0).getIsNew());
    }

    @org.junit.jupiter.api.Test
    void testAddMenuItemWithIsNotNew() {
        Restaurant r = new Restaurant();
        MenuItem newItem1 = new MenuItem(5.99, "Cheeseburger", "Entree", false);
        r.addMenuItem(newItem1);
        assertEquals(1, r.getMenu().getItems().size());
        assertEquals(false, r.getMenu().getItems().get(0).getIsNew());
    }

    @org.junit.jupiter.api.Test
    void testLineItems() {
        Restaurant r = new Restaurant();
        // Add 5 menu items in for loop
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            MenuItem newItem = new MenuItem();
            if (r.addMenuItem(newItem) == true) {
                counter++;
            }
        }
        String[] lineItems = r.getMenu().getLineItemList(true);
        assertEquals(counter, lineItems.length);
    }
}
