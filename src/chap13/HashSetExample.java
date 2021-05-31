package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.System.out;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        out.println(set);

        set.add("Java");
        out.println(set);

        set.add("JDBC");
        out.println(set);

        set.add("Servlet/JSP");
        out.println(set);

        set.add("Java");
        out.println(set);

        set.add("iBATIS");
        out.println(set);

        int size = set.size();
        out.println("총 객체 수 : " + size);

        Iterator<String> iter = set.iterator();
        out.println(iter);

        while(iter.hasNext()){
            String element = iter.next();
            out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        out.println("총 객체 수 : " + set.size());

        iter = set.iterator();
        for(int i = 0; i < set.size(); i++){
            String element = iter.next();
            out.println("\t" + element);
        }
        
        // for(String element : set){
        //     out.println("\t" + element);
        // }

        set.clear();
        if(set.isEmpty()) { out.println("비어 있음");}
    }
}
