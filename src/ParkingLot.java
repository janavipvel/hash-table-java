import java.util.*;

public class ParkingLot{
    HashMap<String,String> lot=new HashMap<>();

    void park(String car,String slot){
        lot.put(car,slot);
    }

    void leave(String car){
        lot.remove(car);
    }

    public static void main(String[] args){
        ParkingLot p=new ParkingLot();
        p.park("TN01","A1");
        p.park("TN02","A2");
        System.out.println(p.lot);
        p.leave("TN01");
        System.out.println(p.lot);
    }
}