package Maps;
import java.util.*;

public class Map_05
{
    public static void main(String args[])
    {
        Hashtable ht= new Hashtable();
        ht.put(1,"ONE");
        ht.put(3,"Three");
        ht.putIfAbsent(2,"TWO");

        System.out.println(ht);

        TreeMap tm= new TreeMap(); // order of insertion is not maintaind but it is accending sortend on the basis of keys
        tm.put(2,"Hey");
        tm.put(3,"hello");
        tm.put(1,"Holla");

        System.out.println(tm);
    }
}
