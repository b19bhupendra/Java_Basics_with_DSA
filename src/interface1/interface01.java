package interface1;

interface A
{
    int num=4;//bydefault variable is public static final

    //by default every method is abstract in interface
    void show(); //bydefault interface methods are public abstract we can not define its body here

}




public class interface01
{
    public static void main(String []args)
    {
        //to access num
        System.out.println(A.num);//we can not create object of interface class

    }
}
