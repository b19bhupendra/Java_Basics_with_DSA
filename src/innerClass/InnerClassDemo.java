package innerClass;

class A
{
    public void show()
    {
        System.out.println("this method is member of A class");
    }
//    static class B
    class B
    {
        public void diaplay()
        {
            System.out.println("This class b is also a member of class a");
        }
    }
}
public class InnerClassDemo
{
    public static  void main (String []args)
    {
        A obj = new A();
        obj.show();
        //to create the obj of inner class b we need class a and as inner class b is non static to make
        // object of it we need obj of a class like --

        //A.B obj1 = new A.B(); // when inner class is static we don't need obj of A
        A.B obj1 = obj.new B(); // When class is non static then we have use obj of A
        obj1.diaplay();
    }
}

