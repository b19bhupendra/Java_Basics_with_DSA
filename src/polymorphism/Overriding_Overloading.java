package polymorphism;

class Sports
{
    public void sports1()
    {
        System.out.println("There are many types of Sports");
    }
    public void sports2()
    {
        System.out.println("One person can play many Sports");
    }

}
class Cricket extends Sports
{
    public void sports1()
    {
        System.out.println("Cricket is a most famous sports in the world");
    }
    public void sports2()
    {
        System.out.println("Cricket is played between two teams");
    }

}
class Football extends Sports
{
    public void sports1()
    {
        System.out.println("Football is also a part of sports");
    }
    public void sports2()
    {
        System.out.println("Football");
    }

}
public class Overriding_Overloading
{
    public static void main(String []args)
    {
        Cricket cr=new Cricket(); //agr udr cricket h to idhr b cricket type hoga ye same type k honge  but there is a one case inwhich it can be different that if its types is parent  case
      //  cr.sports1();

        Football foot = new Football();
       // foot.sports1();

       // Cricket ka parent h Sports to uska or uska reference variable bana lenge
        Sports ref;

          // cr Cricket object ko refer kr rha h to cr k pass cricket object ka address h
        //if we give its reference  to football  foot so can it hold that reference or not Ofcourse not foot=cr not possible bec its reference must have to same
        //cr ka reference kisi or type reference ko de rhy to vo hold ni kr payega but
        //that reference its parent can hold

        ref=cr; //parent class reference k pass capcity hoti h child cls k object ko hold krne ki
        //to cr k pass Cricket ka address tha to vo address humne ref ko de diya or ref ka type hai Sports jo Cricket ka parent hai

        ref.sports1();
        ref.sports2();

        System.out.println("-------------------------same thing exist in multiple form ------------------------------");
        System.out.println("-----------------HERE WE ACHIVED THE CONCEPT OF METHOD OVERRIDING------------------------");

        ref=foot;
        ref.sports1();
        ref.sports2(); //same line as line 61 but different output

    }
}
