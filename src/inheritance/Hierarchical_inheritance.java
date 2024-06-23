package inheritance;

class Animal1
{
    void speeks()
    {
        System.out.println("Animal can speek");
    }
}
class Tiger1 extends Animal1
{

}
class Monkey extends Animal1
{
    void laugh()
    {
        System.out.println("HEHE");
    }

}
class Deer extends Animal1
{

}
public class Hierarchical_inheritance
{
    public static void main(String []args)
    {
        Deer d=new Deer();
        d.speeks();
        Monkey m=new Monkey();
        m.laugh();
        m.speeks();
    }
}
