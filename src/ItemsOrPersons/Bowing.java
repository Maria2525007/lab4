package ItemsOrPersons;

import Actions.Actions;
import Locations.*;

public abstract class Bowing {
    Actions actions;
    static void changeLocation(Locations locations1, Locations locations2, Hatifnatts item){
        locations1.listofhatiftans.remove(0);
        locations2.listofhatiftans.add(item);
        if (Math.random()*100<=20 && locations1.listofhatiftans.size()>1) {
            System.out.println(Hatifnatts.name + Actions.BOWED.getActionDescribe());
        }
            }


    public abstract Hatifnatts create();

    public abstract HatifnattsWithoutActions createHatifnattsWithoutActions();
}

