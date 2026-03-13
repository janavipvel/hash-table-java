import java.util.*;

public class Analytics{
    HashMap<String,Integer> visits=new HashMap<>();

    void visit(String page){
        visits.put(page,visits.getOrDefault(page,0)+1);
    }

    void show(){
        for(String p:visits.keySet()){
            System.out.println(p+" "+visits.get(p));
        }
    }

    public static void main(String[] args){
        Analytics a=new Analytics();
        a.visit("home");
        a.visit("home");
        a.visit("contact");
        a.show();
    }
}