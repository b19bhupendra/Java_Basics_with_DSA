package encapsulation;

public class Setters_Getters
{
    public static void main(String []args)
    {
        Students obj= new Students();
        obj.setAge(23);
        int studentAge=obj.getAge();
        System.out.println(studentAge);
        obj.setName("Bhupendra");
        String StudentName=obj.getName();
        System.out.println(StudentName);
    }
}
class Students
{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
