import java.util.*;

public class MultiLevelCache{
    HashMap<Integer,String> l1=new HashMap<>();
    HashMap<Integer,String> l2=new HashMap<>();

    void put(int k,String v){
        l1.put(k,v);
        l2.put(k,v);
    }

    String get(int k){
        if(l1.containsKey(k)) return l1.get(k);
        return l2.get(k);
    }

    public static void main(String[] args){
        MultiLevelCache m=new MultiLevelCache();
        m.put(1,"Data1");
        m.put(2,"Data2");
        System.out.println(m.get(1));
    }
}