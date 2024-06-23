package lambda_expression;
//inner class==> member inner class, Static inner class, Anonymous


class A
{
    int age;
    String name;

    Address add; //when we want to add address class

    class Address
    { //insted of storing these three variables seprately we have created a different class
        String city;
        String state;
        int pincode;
    }
    public void show()
    {
        System.out.println("Method of A class in Show");
    }
    class B
    {
        public void Display()
        {
            System.out.println("Method of inner class in Display");
        }
    }
    static class C
    {
        public void StaticClass()
        {
            System.out.println("Inside static inner class c in method StaticClass");
        }
    }
}

public class Inner_Class
{
    public static void main(String []args)
    {
        A obj = new A();
        //B obj1=new B(); we cannot create object of b inner class
        //A.B obj1=new B();//B ka obje banane k liye humme A ka object chahiye
        A.B obj1=obj.new B();//we write object of a before new keyword and then B ka object

        //static class ka object banane k liye
        //static k liye we dont need object so in this we dont need object of A class
        A.C obj2=new A.C();// jab static class hai to we can refer that A.C

        obj.show();
        obj1.Display();
        obj2.StaticClass();
        //Display();
    }
}
