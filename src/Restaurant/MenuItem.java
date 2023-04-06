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

    public MenuItem() {
        this.price = 0.00;
        this.description = "No description";
        this.category = "No category";
        this.isNew = false;
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
        return (this.getIsNew() + this.description + " - " + this.price);
    }

    public boolean getIsNew() {
        return isNew;
    }

    public String isItemNew() {
        if (this.isNew) {
            return ("New! - ");
        }
        else {
            return ("");
        }
    }

    public boolean equals(MenuItem comparison) {
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
        return theItem.getDescription() == getDescription();
    }
}
