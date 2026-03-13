import java.util.*;

public class Autocomplete{
    HashMap<String,List<String>> map=new HashMap<>();

    void add(String prefix,String word){
        map.putIfAbsent(prefix,new ArrayList<>());
        map.get(prefix).add(word);
    }

    List<String> search(String prefix){
        return map.getOrDefault(prefix,new ArrayList<>());
    }

    public static void main(String[] args){
        Autocomplete a=new Autocomplete();
        a.add("ja","java");
        a.add("ja","javascript");
        System.out.println(a.search("ja"));
    }
}