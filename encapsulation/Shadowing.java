package encapsulation;

public class Shadowing
{
    public static void main(String []args)
    {
        shadow obj = new shadow();
        obj.setAge(23);
        obj.display();
    }

}
class shadow
{
    private int age; //instance variable

    public void setAge(int age) //inside the block is local variable
    {
        age=age; //here compiler will confuse and assume both as local variable and give default value of int as 0
        // this is called shadoing problem
    }
    public void display()
    {
        System.out.println(age);
    }
}