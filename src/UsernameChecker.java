import java.util.*;

public class UsernameChecker {

    HashMap<String,Integer> users = new HashMap<>();
    HashMap<String,Integer> attempts = new HashMap<>();

    boolean checkAvailability(String username){
        attempts.put(username,attempts.getOrDefault(username,0)+1);
        return !users.containsKey(username);
    }

    void register(String username,int id){
        users.put(username,id);
    }

    List<String> suggestAlternatives(String username){
        List<String> list=new ArrayList<>();
        for(int i=1;i<=3;i++){
            list.add(username+i);
        }
        return list;
    }

    public static void main(String[] args){

        UsernameChecker u=new UsernameChecker();

        u.register("john_doe",1);

        System.out.println(u.checkAvailability("john_doe"));
        System.out.println(u.checkAvailability("jane_smith"));
        System.out.println(u.suggestAlternatives("john_doe"));
    }
}