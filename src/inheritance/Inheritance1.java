package inheritance;
class Human //super class, parent class, base class
{
    private String name;
    int age;

    Human()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class student extends Human //subclass , child class, derived class
{
   // public student()
   // {
    //    super();
   // }
    void display()
    {
        System.out.println("The age is : " +age);
       // System.out.println("The name is :" +name); name variable will not extended bec it is private
        //Private members will not perticipate in inheritance
    }

}
public class Inheritance1
{
    public static void main(String []args)
    {
        student st= new student();
        st.sleep();
        st.display();

    }

}
//Constructor will not perticipate in inheritance
//but fir ye kese excute ho rha (call kese ho rha)
//bec jb hum student class ka object bana rhy to us student class ka default constructor call ho hra or us default
//constructor ki pheli line me  super() method hota h to vo
//  vo super() method parent class k constructor ko call krta h
//super method parent class k constructor ko call krta h