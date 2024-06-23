package inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animal need to sleep");

    }

}
class Tiger extends Animal
{
    void tiger()
    {
        System.out.println("Tiger runs");
    }

}


public class Single_level_Inheritance
{
    public static void main(String []args)
    {
        Tiger t=new Tiger();
        t.sleep();
        t.tiger();
    }

}
