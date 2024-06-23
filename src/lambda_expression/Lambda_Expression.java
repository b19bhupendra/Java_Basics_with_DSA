package lambda_expression;
@FunctionalInterface //this is called annotation means we are telling compiler that what we want
interface Car
{
    void Drive();
    //void show(); agr yhn do method hote to lambda expression nahi kam kregea q ki vo sirf functional interface me kam krta h only one method
}
public class Lambda_Expression
{
    public static void main(String []args)
    {
        Car obj =() ->                // Zero Parameter Lambda expression in javaScript it is an arrow function
        {
            System.out.println("Driving..");
        };
        obj.Drive();
    }
}
