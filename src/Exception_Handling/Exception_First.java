package Exception_Handling;

public class Exception_First
{
    public static void main(String []args)
    {
        int num1=6;
        int num2=0;
        int result=0;
        try
        {
            result=num1/num2;
            System.out.println("HEllo");
        }
        catch (Exception n) // we can write here e inplace of obj e is an reference variable we can write anything here
        {
            System.out.println("SOMETHING WENT WRONG" + n);//or yhn pe vo reference varibale print karayge to vo actual(Specific) problem b bta dega
        }

        System.out.println(result);
        System.out.println("BYE");
    }
}
