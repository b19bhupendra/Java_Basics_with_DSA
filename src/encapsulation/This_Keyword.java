package encapsulation;

public class This_Keyword
{
    public static void main(String []args)
    {
        Student obj = new Student();
        obj.setAge(23); //here setAge is call by obj and obj is referring to new Student() and we are using that obj so this is how
        // this keyword is referring to current object
        obj.setName("Bhupendra");
        obj.display();

    }
}
class Student
{
    private int age;//instance variable
    private String name;
    public void setAge(int age)
    {
        this.age=age;// this keyword is referring to current object
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void display()
    {
        System.out.println(age);
        System.out.println(name);
    }
}
