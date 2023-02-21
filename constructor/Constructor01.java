package constructor;

public class Constructor01
{
    public static void main(String []args)
    {
        Construct obj = new Construct(155);
        obj.display();
    }
}
class Construct
{
    private int rollno;

    Construct(int rollno)
    {
        this.rollno=rollno;
    }
    public void display()
    {
        System.out.println(rollno);
    }
}