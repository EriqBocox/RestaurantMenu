package restaurant;

public class MenuItem {
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem(double aPrice, String aDescription, String aCategory) {
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = true;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String aCategory){
       this.category = aCategory;
    }

    public boolean getNew(){
        return this.isNew;
    }

    public void setNew(boolean aNew){
        this.isNew = aNew;
    }
}

