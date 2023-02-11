package ItemsOrPersons;

import Actions.Actions;
import Locations.Locations;

import java.util.ArrayList;
import java.util.List;

public class MumiFather extends Bowing implements createFishingRod {
    public static String name= "Mumi-Father";
    public List<Items> items = new  ArrayList<>();



    public void startFishing(Locations locations){
        MumiFather mumiFather= new MumiFather();
        FishingRod fishingRod= (FishingRod) mumiFather.createFishingRod();
        System.out.println("Fishing Rod created");
        items.add(fishingRod);
        System.out.println("Fishing Rod added to Mumi-Father's items");
        mumiFather.setActions(Actions.FISHING);
        System.out.println("Mumi-Father sits on a stone");
        locations.objects.add(mumiFather);
    }

    @Override
    public FishingRod createFishingRod() {
        FishingRod fishingRod= new FishingRod();
        return (FishingRod) fishingRod;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    @Override
    public Hatifnatts create() {
        return null;
    }

    @Override
    public HatifnattsWithoutActions createHatifnattsWithoutActions() {
        return null;
    }
}
