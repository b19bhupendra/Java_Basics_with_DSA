package Maps;

import java.util.*;
public class Maps_02
{
    public static void main(String []args )
    {
        HashMap hs= new HashMap();  //order of insertion is  preserved
        hs.put(01, "Bhupendra ");
        hs.put(02,"Hello");
        hs.put("key", "Hey");
        hs.put(04,"Hmm");
        System.out.println(hs);

        LinkedHashMap lhm = new LinkedHashMap(); //order of insertion is preserved
        lhm.put(01,"ONE");
        lhm.put(02,"TWO");
        lhm.put(03,"Three");
        lhm.put(04,"Four");

        System.out.println(lhm);

    }
}
