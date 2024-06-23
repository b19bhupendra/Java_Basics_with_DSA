package interface1;

interface A1
{
    void show();
}
interface X
{
    void abc();
}
class B implements A1,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("abc method");
    }

}
public class Interface03
{
    public static void main(String []args)
    {
        //B obj = new B(); we can do A also
       // A1 obj =new B();
       // obj.show();
        //obj.abc(); ye yhn error ayega q ki interface Parent cls me sirf show h abc ni to b ka object banyge tb dono method ko call kr payege
        B obj =new B();
        obj.show();
        obj.abc();
    }
}
