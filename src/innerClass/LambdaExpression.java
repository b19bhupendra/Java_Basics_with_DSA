package innerClass;

//Lambda expression works on only on the functional interface.
@FunctionalInterface // @ is called annotation
interface NewCar
{
    void dirve(int avg);
}
public class LambdaExpression
{
    public static void main(String args[])
    {
        //this synatx
        NewCar obj = (int avg) ->
        {
            System.out.println("one Parameter Syntax..." +avg);
        };

        obj.dirve(16);

    }
}
