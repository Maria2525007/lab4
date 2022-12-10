import java.util.ArrayList;

public class MumiFather extends ItemsOrPersonWithItems implements createFishingRod {
    private String name= "Mumi-Father";
    private Actions actions= Actions.NOTHING;
    private ArrayList<Items> itmes=new  ArrayList<>();


    public void startFishing(Locations locations){
        MumiFather mumiFather= new MumiFather();
        FishingRod fishingRod= (FishingRod) mumiFather.createFishingRod();
        itmes.add(fishingRod);
        mumiFather.setActions(Actions.FISHING);
        locations.objects.add(mumiFather);
        System.out.println("Mumi-Father started fishing");
    }

    @Override
    public Items createFishingRod() {
        FishingRod fishingRod= new FishingRod();
        return fishingRod;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }
}
