package Maps;
import java.util.*;
import java.util.Map.*;

class  Student
{
    private String name;
    private int age;
    private String city;

    public Student (String name, int age , String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName()
    {
        return name;
    }
    public  int getAge()
    {
        return age;
    }
    public String getCity()
    {
        return city;
    }
    public String toString()
    {
        return name+" "+age +" "+city;
        // to string k andr jo coding h jo responsible object ki  hashcode (address) dene  k liye
    }
    // or agr humn eto string method ko over ride kr rkha h to jo object humme chahiye vo mill jayega
    // or ye to string method internally call hota hai
}

public class Map_04
{
    public static void main(String []args)
    {
        Student st1= new Student("hello",19,"delhi");
        Student st2= new Student("hello1", 18, "Lucknow");
        Student st3= new Student("hey2",10, "Banglore");

        Map map= new HashMap();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);

        System.out.println(map);

         // to call both keys and values
        Set set=map.entrySet();
        Iterator it= set.iterator();

        while (it.hasNext())
        {
            //System.out.println(it.next()); ye sirf print kr rhy hai
            // now we have to store
            Map.Entry data =(Entry) it.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }

}
