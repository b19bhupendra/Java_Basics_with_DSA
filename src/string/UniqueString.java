package string;
import java.util.*;
public class UniqueString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer>strlist =new ArrayList<>();
        for(int i =0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    strlist.add(j);
                    //System.out.println(strlist);s
                }
            }
            /*if(!strlist.contains(i))
            {
                System.out.print(str.charAt(i));
            }*/
            //new logic if i dont want to use contains
            boolean found = false;
            for(int k = 0; k < strlist.size(); k++)
            {
                if(strlist.get(k) == i)
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                System.out.print(str.charAt(i));
            }

        }

    }
}