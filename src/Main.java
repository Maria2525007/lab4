import java.util.ArrayList;

public class Main implements createItemsAndPersons, CreateOfLocations, CreateOfHatiftans, createItems, MumiFatherActions, ExPrayerInterface {
    public static void main(String[] args)  {
        ArrayList<HatifnattsWithoutActions> list1= new ArrayList<>();
        ArrayList<Locations> locations= new ArrayList<>();
        Main main= new Main();
        locations.add(main.createLocationsLeft());
        locations.add(main.createLocationsMiddle());
        locations.add(main.createLocationsRight());
        System.out.println(locations.toString());
        for (int i=0; i<450; i++){
            list1.add(main.createHatifnattsWithoutActions());
        }
        main.ExFishing();
        main.Execute(locations);
    }

    @Override
    public Hatifnatts create() {
        return new Hatifnatts();
    }

    @Override
    public HatifnattsWithoutActions createHatifnattsWithoutActions() {
        return new HatifnattsWithoutActions();
    }


    @Override
    public Locations createLocationsMiddle() {
        Main main= new Main();
        MiddleOfIscland middleOfIscland= new MiddleOfIscland();
        middleOfIscland.listofsimpleitems.add(main.createBush());
        middleOfIscland.listofsimpleitems.add(main.createPillar());
        middleOfIscland.listofsimpleitems.add(main.createBush());
        return middleOfIscland;
    }

    @Override
    public Locations createLocationsRight() {
        return new RightOfIscland();
    }

    @Override
    public Locations createLocationsLeft() {
        Main main= new Main();
        LeftOfIscland leftOfIscland= new LeftOfIscland();
        for (int i=0; i<300; i++){
            leftOfIscland.listofhatiftans.add(main.create());
        }
        return leftOfIscland;
    }

    @Override
    public Locations createStone() {
        return new Stone();
    }

    @Override
    public Locations createSee() {
        Main main= new Main();
        See see= new See();
        see.listofsimpleitems.add(main.createSun());
        see.objects.add(main.createFog());
        return null;
    }

    @Override
    public Bush createBush() {
        return new Bush();
    }

    @Override
    public Barometer createBarometr() {
        return new Barometer();
    }

    @Override
    public Pillar createPillar() {
        Main main = new Main();
        Pillar pillar = new Pillar();
        pillar.itemsArrayList.add(main.createBarometr());
        return pillar;
    }

    @Override
    public Sun createSun() {
        return new Sun();
    }

    @Override
    public MumiFather createMumiFather() {
        return new MumiFather();
    }

    @Override
    public Fog createFog() {
        return new Fog();
    }

    @Override
    public void ExFishing() {
        Main main= new Main();
        main.createMumiFather().startFishing(main.createStone());
    }

    @Override
    public void Execute(ArrayList<Locations> list) {
        ExPrayer exPrayer= new ExPrayer();
        exPrayer.startPrayer(list);
    }
}
