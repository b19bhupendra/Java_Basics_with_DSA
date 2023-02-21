package string;

public class Final_Mutable
{
    public static void main(String [] args)
    {
        final int a=10;
        //a=20; this will give compile time error

        final StringBuffer sb= new StringBuffer("Hey");
        sb.append("RAM");
        System.out.println(sb); // so we can make changes in that string but we can not make new object

       // sb= new StringBuffer("Hello"); it is giving error since sb can refer only perivous ob bec it is final it can not hold reference of other object
        System.out.println(sb.capacity());//16+3=19
        System.out.println(sb.charAt(1));

        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.capacity()); // kitna store kr skta h
        sb2.append("JavaCode");
        System.out.println(sb2+" length  "+sb2.length()); // kitne value humne dalli
        sb2.setCharAt(0,'Z');
        System.out.println(sb2);

        StringBuilder ss=new StringBuilder(15);// now here 15 will be its capacity
        ss.append("Heyyy");
        ss.trimToSize();// it will give jitne char utni size kr dega 
        System.out.println(ss.capacity());



    }
}
