import java.util.ArrayList;

public class ExPrayer implements ExChangeLocation {
    void startPrayer(ArrayList<Locations> locations){
        Integer count=0;
        while (True) {
            ExPrayer exPrayer= new ExPrayer();
            count++;
            if (count ==3) {
                count = 0;
            }
            Locations locations1=locations.get(count);
            Locations locations2= locations.get(count);
            if (count==0){
                locations2 = locations.get(2);
            }
            else {
                locations2 = locations.get(count - 1);
            }
            ArrayList<Hatifnatts> list1=locations1.listofhatiftans;
            if (list1.size()>0) {
                for (int i = 0; i < list1.size(); i++) {
                    if (Math.random() * 100 < 10) {
                        Hatifnatts hatifnatts = locations1.listofhatiftans.get(i);
                        exPrayer.executeChangeLocation(locations1, locations2, hatifnatts);
                    }
                }
            }
        }
    }


    @Override
    public void executeChangeLocation(Locations locations1, Locations locations2, Hatifnatts item) {
        ItemsOrPersonWithItems.changeLocation(locations1, locations2, item);
    }
}
