import java.util.*;

public class RateLimiter{
    HashMap<String,Integer> req=new HashMap<>();
    int limit=5;

    boolean allow(String user){
        req.put(user,req.getOrDefault(user,0)+1);
        return req.get(user)<=limit;
    }

    public static void main(String[] args){
        RateLimiter r=new RateLimiter();
        for(int i=0;i<6;i++){
            System.out.println(r.allow("user1"));
        }
    }
}