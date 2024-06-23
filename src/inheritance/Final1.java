package inheritance;

/* final class Animal01 IF we declare class as final then it can not inherited
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }

} */
class Animal01
{
    final int age =23;
    final void sleep()//if we declare method as final then it cannot be overriden in child class
    {
        //age =20; age cannot be chnaged bec it is final
        System.out.println("Animal is sleeping");
    }

}
class Tiger01 extends Animal01
{
   // final void sleep()//if we declare method as final then it cannot be overriden in child class
   // {
   //     System.out.println("Animal is sleeping");
   // }
}
public class Final1
{
    public static void mian(String []args)
    {
        Tiger01 t01=new Tiger01();
        t01.sleep();

    }
}
