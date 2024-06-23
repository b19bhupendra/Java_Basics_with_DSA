package interface1;

interface x
{
    void show1();

    default void java8()
    {
        System.out.println("Java 8 feature in which we can define method inside interface");
    }
    static void newfeature()
    {
        System.out.println("Java 8 feature in which we can define static method inside interface ");
    }
}
class Define implements x
{
    public void show1()
    {
        System.out.println("In show");
    }

}
public class JAva8
{
    public static void main(String []args)
    {
        x.newfeature();//we can call this method withod creating the object bec it is static
        // x.java8(); this will not work bec it is not an static method for this we have to create an class

        x obj=new Define(); //parent interface ka b reference use kr skte hain
        obj.java8();

    }
}
