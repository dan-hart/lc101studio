package Restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public static String[] categories = {"Appetizer", "Entree", "Dessert", "Drink"};
    public static String[] appetizers = {"Wings", "Fries", "Salad", "Soup"};
    public static String[] entrees = {"Steak", "Chicken", "Pasta", "Fish"};
    public static String[] desserts = {"Cake", "Pie", "Ice Cream", "Cupcakes"};
    public static String[] drinks = {"Water", "Soda", "Beer", "Wine"};

    public MenuItem() {
        this.price = Math.random() * 20;
        // Get random category from categories array
        int randomCategory = (int) (Math.random() * categories.length);
        this.category = categories[randomCategory];
        switch (randomCategory) {
            case 0:
                // Get random appetizer from appetizers array
                int randomAppetizer = (int) (Math.random() * appetizers.length);
                this.description = appetizers[randomAppetizer];
                break;
            case 1:
                // Get random entree from entrees array
                int randomEntree = (int) (Math.random() * entrees.length);
                this.description = entrees[randomEntree];
                break;
            case 2:
                // Get random dessert from desserts array
                int randomDessert = (int) (Math.random() * desserts.length);
                this.description = desserts[randomDessert];
                break;
            case 3:
                // Get random drink from drinks array
                int randomDrink = (int) (Math.random() * drinks.length);
                this.description = drinks[randomDrink];
                break;
        }
        // get random boolean for isNew
        // 10% chance of being true
        this.isNew = Math.random() < 0.1;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getLineItem() {
        // round price to two decimal places
        if (this.isNew) {
            return (this.description + " - " + String.format("$%.2f", this.price) + " - " + this.isItemNew());
        } else {
            return (this.description + " - " + String.format("$%.2f", this.price));
        }
    }

    public boolean getIsNew() {
        return isNew;
    }

    public String isItemNew() {
        if (this.isNew) {
            return ("New!");
        }
        else {
            return ("");
        }
    }

    @Override
    public boolean equals(Object comparison) {
        if (comparison == this) {
            return true;
        }
        if (comparison == null) {
            return false;
        }
        if (comparison.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription().equals(getDescription());
    }
}
