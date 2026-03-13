import java.util.*;

public class PlagiarismDetector{
    HashSet<String> docs=new HashSet<>();

    boolean addDoc(String d){
        if(docs.contains(d)) return false;
        docs.add(d);
        return true;
    }

    public static void main(String[] args){
        PlagiarismDetector p=new PlagiarismDetector();
        System.out.println(p.addDoc("AI Assignment"));
        System.out.println(p.addDoc("AI Assignment"));
    }
}