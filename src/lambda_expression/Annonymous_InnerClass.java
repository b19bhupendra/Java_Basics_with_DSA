package lambda_expression;

interface Annon
{
    void showMe();
}
//interface ka object to ban ni skta to uske liye humme class banani padegi to implement is and fir uska object
//to class na banani pde sirf interface ko impelement krne k liye so for this we have Annonymous class

public class Annonymous_InnerClass
{
    public static void main(String []args)
    {
        Annon obj = new Annon() // yhnn pe object ek annonymous class ka ban rha h interface ka nahi
        {
            public void showMe()//if we want to use any class multiple time its better to create seperate class but agr ek bar use krna h to this is the best way
            {
                System.out.println("Annonymous class");

            }
        };
        obj.showMe();
    }
}
