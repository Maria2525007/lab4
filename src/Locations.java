

import java.util.ArrayList;

public abstract class Locations {
    public ArrayList<Hatifnatts> listofhatiftans= new ArrayList<>();
    public ArrayList<ItemsOrPersonWithItems> objects= new ArrayList<>();
    public ArrayList<Items> listofsimpleitems= new ArrayList<>();
    protected LocationsName locationsName;

    public LocationsName getLocationsName() {
        return locationsName;
    }

    public ArrayList<Hatifnatts> getListofhatiftans() {
        return listofhatiftans;
    }

    public ArrayList<ItemsOrPersonWithItems> getObjects() {
        return objects;
    }

    public ArrayList<Items> getListofsimpleitems() {
        return listofsimpleitems;
    }
}
