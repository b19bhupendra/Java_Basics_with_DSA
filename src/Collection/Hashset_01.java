package Collection;
import java.util.*;
public class Hashset_01
{
    public static void main(String [] args)
    {
        HashSet hs= new HashSet();
        hs.add(23);
        hs.add(45);
        hs.add(78);
        hs.add(80);

        System.out.println(hs);

        LinkedHashSet lhs1= new LinkedHashSet();
        lhs1.add(45);
        lhs1.add(86);
        lhs1.add(545);
        System.out.println(lhs1);
    }

}
