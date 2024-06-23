package lambda_expression;

interface Average
{
    void Numbers(int n1,int n2);
}
public class Two_Parameter_LambdaExpression
{
    public static void main(String args[])
    {
        Average obj =(int n1,int n2)->
        {
            int Avg=n1+n2/2;
            System.out.println(Avg);
        };
        obj.Numbers(5,10);
    }
}
