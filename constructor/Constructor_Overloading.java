package constructor;

public class Constructor_Overloading
{
    public static void main(String []args)
    {
        overloading obj1= new overloading();
        obj1.display();

        overloading obj2=new overloading("bhupendra");
        obj2.display();

        overloading obj3=new overloading(23,"BHUPENDRA");
        obj3.display();
    }
}
class overloading
{
    private int age;
    private String name;

    public overloading()
    {
        this("name");
        System.out.println("Default constructor is called ");
        name="Bhupendra";
        age=23;
    }
    public overloading(String name)
    {
        this.name=name;
        age=19;
    }
    public overloading(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public void display()
    {
        
        System.out.println(name);
        System.out.println(age);
    }
}
