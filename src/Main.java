import Actions.*;
import ItemsOrPersons.*;
import Locations.*;

import java.util.ArrayList;

public class Main implements createItemsAndPersons, CreateOfLocations, CreateOfHatiftans, createItems, MumiFatherActions, ExPrayerInterface {
    public static void main(String[] args)  {
        ArrayList<HatifnattsWithoutActions> HatifnattsForWaiting= new ArrayList<>();
        ArrayList<Locations> locations= new ArrayList<>();
        Main main= new Main();
        locations.add(main.createLocationsLeft());
        locations.add(main.createLocationsMiddle());
        locations.add(main.createLocationsRight());
        main.createHatifnattsWithoutActions();
        main.ExFishing();
        main.Execute(locations);

    }

    public Locations createLocationsMiddle() {
        Main main= new Main();
        MiddleOfIscland middleOfIscland= new MiddleOfIscland();
        System.out.println(MiddleOfIscland.name + Actions.CREATED.getActionDescribe());
        middleOfIscland.listofsimpleitems.add(main.createBush());
        System.out.println(Bush.name + Actions.ADDED.getActionDescribe() + MiddleOfIscland.name);
        middleOfIscland.listofsimpleitems.add(main.createPillar());
        System.out.println(Pillar.name + Actions.ADDED.getActionDescribe() + MiddleOfIscland.name);
        return middleOfIscland;
    }

    public Locations createLocationsRight() {
        System.out.println(RightOfIscland.name + Actions.CREATED.getActionDescribe());
        return new RightOfIscland();
    }


    public Locations createLocationsLeft() {
        Main main= new Main();
        LeftOfIscland leftOfIscland= new LeftOfIscland();
        System.out.println(LeftOfIscland.name + Actions.CREATED.getActionDescribe());
        for (int i=0; i<300; i++){
            leftOfIscland.listofhatiftans.add(main.create());
        }
        System.out.println((int) leftOfIscland.listofhatiftans.size() + " " + Hatifnatts.name + Actions.CREATED.getActionDescribe() + " on the " + LeftOfIscland.name);
        return leftOfIscland;
    }


    public Locations createStone() {
        System.out.println(Stone.name + Actions.CREATED.getActionDescribe());
        return new Stone();
    }


    public Locations createSea() {
        Main main= new Main();
        Sea sea= new Sea();
        System.out.println(Sea.name + Actions.CREATED.getActionDescribe());
        sea.listofsimpleitems.add(main.createSun());
        sea.objects.add(main.createFog());
        return null;
    }


    public Bush createBush() {
        System.out.println(Bush.name + Actions.CREATED.getActionDescribe());
        return new Bush();
    }


    public Barometer createBarometr() {
        System.out.println(Barometer.name + Actions.CREATED.getActionDescribe());
        return new Barometer();
    }


    public Pillar createPillar() {
        Main main = new Main();
        Pillar pillar = new Pillar();
        System.out.println(Pillar.name + Actions.CREATED.getActionDescribe());
        pillar.itemsArrayList.add(main.createBarometr());
        System.out.println(Barometer.name + Actions.ADDED.getActionDescribe() + Pillar.name);
        return pillar;
    }


    public Sun createSun() {
        System.out.println(Sun.name + Actions.CREATED.getActionDescribe());
        return new Sun();
    }


    public createFishingRod createFishingRod() {
        return null;
    }


    public MumiFather createMumiFather() {
        MumiFather MumiFather = new MumiFather();
        System.out.println(ItemsOrPersons.MumiFather.name + Actions.CREATED.getActionDescribe());
        return new MumiFather();
    }


    public MumiFather createFog() {
        System.out.println(Fog.name + Actions.CREATED.getActionDescribe());
        return new MumiFather();
    }


    public void ExFishing() {
        Main main= new Main();
        main.createMumiFather().startFishing(main.createStone());
        System.out.println(MumiFather.name + " started " + Actions.FISHING.getActionDescribe());
    }

    public Hatifnatts create() {
        return new Hatifnatts();
    }


    public void createHatifnattsWithoutActions() {
        ArrayList<HatifnattsWithoutActions> HatifnattsForWaiting = new ArrayList<HatifnattsWithoutActions>();
        HatifnattsWithoutActions main = new HatifnattsWithoutActions();
        for(int i = 0; i<450; i++)
        {
            HatifnattsForWaiting.add(main.createHatifnattsWithoutActions());
        }
        System.out.println(HatifnattsForWaiting.size() + " " + Hatifnatts.name + Actions.EXPECTED.getActionDescribe() + " for arriving");
        new HatifnattsWithoutActions();
    }


    public void Execute(ArrayList<Locations> list) {
        ExPrayer exPrayer= new ExPrayer();
        exPrayer.startPrayer(list);

    }
}
