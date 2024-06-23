package interface1;
//to optimize this
//we will create an class which has same method but we won't define anthing in thst method
interface Computer
{
     void compileCode();

}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}
//if company devloper ko laptop ni desktopo deti h
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("DEsktop");
    }
}
class Devloper
{
    //public void buildApp(Laptop obj) // yhn b humme fir desktop dena pdega
    //public  void buildApp(Desktop obj) // it will work but everytime we have to change if compny give laptop or desktop we are dependent

    public void buildApp(Computer obj) // yhn pe hum specific ni ho rhy computer can any laptop or desktop iska adv ye h ki fir vo lapy ho ya desk sbke liye chalega
    {
       // Laptop obj=new Laptop();//now leptop ka object ek bar banega (EK devloper k liye ek object)
        System.out.println("building app");
        //if developer wants to compile the code so we have to call the comileCode method here
        //to call  compileCode here we have to make object of Laptop bec it is non-static method of class Laptop
     //##   Laptop obj =new Laptop();
        //yhn pe jitni bar hum bukdApp ko call krege utni bar naya object banega which is not optimized (ye smjh lo developr jitni bar cmpny jayega use utni bar new laptop millega esa ni hota )
        //to hum isse class k andr or method k bhar bnayge ye object
      //  obj.compileCode(); yhn pe obj ab accessible ni h q ki laptop ka object main maine bana h so hum laptop ka obj bikdApp me  pass kr denge
        //or yhn recive kr lenge
    }
}
public class Interface02
{
    public static void main (String []args)
    {
       // Laptop obj=new Laptop();//isse main me bnayge mtlb ki jb developer comny jayega to laptop leke jayega
        //laptop k object me obj pass kr denge jisse buildapp me access kr paye

        //to yhn desktop ka obj banayge
        Computer obj = new Desktop(); //yhn pe parrent class ka reference de dekge


        Devloper dev= new Devloper();
        dev.buildApp(obj); //

    }
}
