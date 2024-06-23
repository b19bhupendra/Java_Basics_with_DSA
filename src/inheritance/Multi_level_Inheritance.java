package inheritance;

class Demo1
{
    void display()
    {
        System.out.println("display method in Demo1 class");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class Multi_level_Inheritance
{
    public static void main(String []args)
    {
        Demo3 d= new Demo3();
        d.display();
    }
}
