//MULTIPLE TASKS WITHIN A SINGLE RUN METHOD
//MTLAB EK RUN METHOD KI HELP SE MULTIPLE TASK KRNA

package MultiThreading;
import java.util.Scanner;
class Single extends Thread
{
    public void run()
    {
        String tName=Thread.currentThread().getName();//mtlb jo thread ko mauka milla h jo phle run method ko excute kr hra h uska hum naam nikal rhy ant
        //then usse store kr lenege string type tName me
        if(tName.equals("CALC")) //JO METHOD PHELE CHALEGA FOR EXAMPLE PHELE CALC NAME KA CHLA TO UPR HUMNE NAME NIKAL LIYA H THREAD KA
        {//JO CHLEGA TO IF ME VO CHECK KREGA CALC H KI NI AGR H TO IF ME JAKE CALC() METHOD KO CALL KR DEGA
            calc();
        }
        else
        {
            imp();
        }
    }
    public void calc()
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
    public void imp()
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
public class Single_runMEthod
{
    public static void main(String []args)
    {
        Single thread1 = new Single();
        Single thread2 = new Single(); //do object bec do activities

        thread1.setName("CALC"); //HERE WE ARE SITTING THE THREAD NAME
        thread2.setName("IMPORTANT");

        thread1.start();//STARTING THE THREAD MEANS GIVING TO THREAD SCHEDULER
        thread2.start();
    }
}
