package lambda_expression;

interface Cars
{
    void driving(int parameter);
}
public class One_Parameter_LambdaExpression
{
    public static void main(String [] args)
    {
        Cars obj=(int parameter)->
        {
            System.out.println("One Parameter Syntax "+parameter); //in one parameter () braket are also optional
        };
        obj.driving(1);
    }
}
