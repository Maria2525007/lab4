abstract class ItemsOrPersonWithItems {
    private Actions actions;
    static void changeLocation(Locations locations1, Locations locations2, ItemsOrPersonWithItems item){
        locations1.objects.remove(item);
        locations2.objects.add(item);
    }
    static void changeLocation(Locations locations1, Locations locations2, Hatifnatts item){
        locations1.listofhatiftans.remove(0);
        locations2.listofhatiftans.add(item);
        if (Math.random()*100<=20 && locations1.listofhatiftans.size()>1) {
            System.out.println("Hatiftan bowed");
        }
        if (locations1.getLocationsName().hashCode()== LocationsName.MIDDLE.hashCode()){
            if (Math.random()*100<=50 && locations1.getLocationsName().equals(LocationsName.MIDDLE)){
                System.out.println("Hatiftan bowed for pillar");
            }
        }
    }
}
