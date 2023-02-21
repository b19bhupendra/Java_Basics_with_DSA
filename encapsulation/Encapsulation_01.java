package encapsulation;

public class Encapsulation_01
{
    public static void main(String []args)
    {
        Encap_Student obj = new Encap_Student();
        // obj.roll_no=155; roll no is private so we cannot give value directly
        // obj.name="bhupendra";
        obj.setData();//here we are calling set method to set the value
        obj.show();


    }
}

class Encap_Student
{
   // int roll_no;
   // String name;
    private int roll_no;
    private String name;

    //so we can set private values with the help of set method
    public void setData()
    {
        roll_no=155;
        name="Bhupendra";

    }
    public void show()
    {
        System.out.println(roll_no+" "+name);
    }

}