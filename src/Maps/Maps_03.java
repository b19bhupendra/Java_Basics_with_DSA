package Maps;
import java.util.Map.*;
import java.util.*;
public class Maps_03
{
    public static void main (String []args)
    {
        Map map = new HashMap();
        map.put(1,"Abc");
        map.put(2,"asd");
        map.put(3,"fvdf");
        map.put(4,"knb");

        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println("_____________________________________________________");
        //to access only keys
        //we have method keyset
        Set keySet=map.keySet(); //this will return keys
        Iterator itr1=keySet.iterator();
        while(itr1.hasNext())
        {
            //System.out.println(itr1.next());
            Integer key =(Integer)itr1.next();//storing values in key AND downCasting in Integer bec map values are in object
            System.out.println(key); //storing and then printing
        }
        System.out.println("_____________________________________________________");
        //to access only values
        // we have to call map.values

        Collection values = map.values();
        Iterator itr2= values.iterator();
        while(itr2.hasNext())
        {
            ///System.out.println(itr2.next());
            String value=(String)itr2.next(); //downCasting object to String type bec its values are in string type
            System.out.println(value);
        }
        System.out.println("__________________________________________________");
        // to access both keys and values
        //it wil return all the entries in the map
        //we will use entrySet method
        Set entrySet= map.entrySet();
        Iterator itr3= entrySet.iterator();
        while (itr3.hasNext())
        {
            ///System.out.println(itr3.next());
            Map.Entry data =(Entry)itr3.next();//entry map k andr h to usse use krne k liye
            // we have to write map.entry
            System.out.println(data.getKey()+" : "+data.getValue());
        }



    }
}
