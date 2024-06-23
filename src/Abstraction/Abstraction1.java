package Abstraction;

abstract class Aeroplane3 // if there any method is abstract so we must have to declare its class also abstract
{
   abstract public void takeoff();

    abstract public void fly();//methods which do not have body and have only implementation are call abstract method
    //and these methods do not have body bec its overriden so its propety is modified so that parent method body is useless so we remove it and declare it as abstract

    public void landing() //inheritaed method
    {
        System.out.println("AeroPlane is Landing");
    }
}
class CargoPlane3 extends Aeroplane3
{
    public void takeoff() //overriden method
    {
        System.out.println("CargoPlane is takingoff");
    }
    public void fly()
    {
        System.out.println("CargoPlane is Flying");
    }
    public void alert() //specilized method
    {
        System.out.println("ALERT");
    }
}

class PassengerPlane3 extends Aeroplane3
{
    public void takeoff()
    {
        System.out.println("PassengerPlane is takingoff");
    }
    public void fly()
    {
        System.out.println("PassengerPlane is Flying");
    }

}


public class Abstraction1
{
    public static void main(String []args)
    {
        CargoPlane3 ref1=new CargoPlane3(); //AeroPlane3 ref1=new CargoPlane3 this is also possible we can also give parent class name
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        ref1.alert();//agr hum cargoplane3 ki jgh parent class use krte to hum specilized method ko directly call ni kr pate

        Aeroplane3 ref3=new PassengerPlane3();//PassengerPlane3 ref3=new PassengerPlane3();
        ref3.takeoff();
        ref3.fly();

    }
}
//yhn pe overriden walli properties print hogi na ki parent class ki
