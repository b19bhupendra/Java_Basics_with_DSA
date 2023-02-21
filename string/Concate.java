package string;

public class Concate
{
    public static void main(String []args)
    {
        String s1=new String ("Hey");
        s1= s1.concat(" Ram");
        System.out.println(s1);

        String s2="Hello";
        String s3=s2.concat(" Java");
        String s4= new String("Skills");
        s4=s4.concat(" and DSA");
        System.out.println(s3);
        System.out.println(s4);

        String str1="Hare";
        String str2="Ram"+" Hare";
        String str3=str1+str2;
        System.out.println(str2);
        System.out.println(str3);
    }
}
