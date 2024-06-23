package inheritance;


class Aeroplane
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flaying");
    }
}
class CargoPlane extends Aeroplane
{
    public void fly() //here we are modifying the body of parrent class it means we are using  overriden method
    {
        System.out.println("CargoPlane fly at lower height"); //overriding (modifying)
    }
    public void CarryGoods() //Such methods which are not present in the parent class they are only present in the
    {        //child class are called Specialized method

        System.out.println("CargoPlane carries goods");
    }

}
class PassengerPlane extends Aeroplane
{
    public void fly() //here we are modifying the body of parrent class it means we are using  overriden method
    {
        System.out.println("PassengerPlane fly at medium height"); //overriding (modifying)
    }
    public void CarryPassengers()
    {//Such methods which are not present in the parent class they are only present in the
        //child class are called Specialized method
        System.out.println("PassengerPlane carries Passengers");
    }


}
public class Inheritance_Methodss
{
    public static void main(String []args)
    {
     CargoPlane cp=new CargoPlane();
     cp.fly();
     cp.takeOff();
     cp.CarryGoods();

     System.out.println("Another class(PAssenger ) object is calling now");

     PassengerPlane pp=new PassengerPlane();
     pp.fly();
     pp.takeOff();
     pp.CarryPassengers();
    }
}
