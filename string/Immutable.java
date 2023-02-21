package string;
public class Immutable
{
    public static void main(String []args)
    {
        String str1= "Hello";
        String str2="Hello";
        System.out.println(str1==str2);
        String str3= new String("Hey");
        String str4= new String("Hey");
        System.out.println(str3==str4);

    }
}
