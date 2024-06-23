package MultiThreading;


import java.util.Scanner;

class Calci implements Runnable
{
    public void run()
    {
        System.out.println("Calculation task started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=sc.nextInt();

        System.out.println("Please enter the second number");
        int num2=sc.nextInt();

        int res =num1+num2;
        System.out.println(res);
        System.out.println("calculation task ended");
        System.out.println("-------------------------------------------");
    }
}
class Message1 implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important messages");
        try
        {
            for(int i =0; i<3;i++)
            {
                System.out.println("Skills are important to survive in it industry");
                Thread.sleep(1000);//Thread sleep ki wjh se exception use kiya hai
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong ");
        }
    }
}
public class Creating_runableThread
{
    public static void main(String []args)
    {
        Calci obj1 = new Calci();
        Message1 obj2=new Message1();

        Thread t1 = new Thread(obj1); //Calci clas Thread ko extend ni kr rhi  or Thread cls k bich koi relation ni h to thread ka obje alg se bnna padega hr cls k liye or us obj me Calci clas ka address pass kr denge
        // or Thread cls ka jo constructor h vo is calci cls k address ko le k use krega
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
