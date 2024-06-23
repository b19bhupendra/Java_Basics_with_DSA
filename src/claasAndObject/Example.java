package claasAndObject;

public class Example
{
    long roll_number= 201910101110155L;
    String name = "Bhupendra";
}
class Info
{
    public static void main(String []args)
    {
        Example obj = new Example();
        System.out.println(obj.roll_number);
        System.out.println(obj.name);
    }
}
