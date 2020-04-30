package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastChanged;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(){
        this.lastChanged = new Date();
    }

    public Date getLastChanged(){
        return this.lastChanged;
    }

    public void setLastModified(Date aLastChanged) {
        this.lastChanged = aLastChanged;
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuItemsList){
        this.menuItems = aMenuItemsList;
    }

    public void addMenuItem(MenuItem aMenuItem){
        this.menuItems.add(aMenuItem);
        this.lastChanged = new Date();
    }

    public void removeMenuItem(int aMenuItemIndex){
        this.menuItems.remove(aMenuItemIndex);
        this.lastChanged = new Date();
    }

    public void updateMenuItem(int aMenuItemIndex, MenuItem aMenuItem){
        this.menuItems.set(aMenuItemIndex, aMenuItem);
        this.lastChanged = new Date();
    }
}
