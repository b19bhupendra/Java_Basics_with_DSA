package innerClass;


interface Car
{
    void drive();
}
public class AnonmousInnerClass
{
    public static void main(String []args)
    {
        Car obj = new Car() // here object is creating of this anonmous class  or file structure me ye 1 dega q ki name ni h to numbbering de dega and ek or banyge ese to 2 dedega
        {
            public void drive()
            {
                System.out.println("In anaonmous class ");
                System.out.println("A anonmous class is a class that do not have the name and it is inside the outer class so it is called anonmous inner class");
            }
        };// and this class will be used onec and if we want to make object again then we need to make same class again 
    obj.drive();
    }

}
