package polymorphism;
class AeroPlane2
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking OFF");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("CargoPlane require longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("PassengerPlane require Medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane require short runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at high height");
    }
}
class AirPort //generalistick class
{
    public void poly(AeroPlane2 ref)
    {
        ref.takeOff();
        ref.fly();
        System.out.println("-------------------------------------");
    }
}
public class Polymorphism1
{
    public static void main(String []args)
    {
        CargoPlane2 cp=new CargoPlane2();

        PassengerPlane2 pp=new PassengerPlane2();

        FighterPlane2 fp=new FighterPlane2();

        AirPort a=new AirPort();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

    }
}
