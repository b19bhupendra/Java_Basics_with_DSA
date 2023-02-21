package string;

public class Compare
{
    public static void main(String []args)
    {
        String str1="Hey";
        String str2= new String ("Hey");
        String str5= new String ("Hey");
        System.out.println(str1==str2); //== will compare reference is refering to same obj or not

        System.out.println(str1.equals(str2)); // equals() will compare values are same or not

        String str3="Hey";
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        String str4="HEY";
        System.out.println("str4.equals(str3) "+str4.equals(str3));
        System.out.println("str2= =str5 "+str2==str5);
        System.out.println(str2.equals(str5));
    }
}
