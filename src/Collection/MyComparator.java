package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class StringLengthComparator implements Comparator<String> {
    //  o1= "ok" , o2 = "bye"
    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }
}

class TestComparator implements Comparator<Integer>{
    /*
    This method determines the order of o1 and o2 the return type value tells the relative order of the two numbers
    if int return is negative then o1 will come before o2
    if zero then o1 and o2 are equal in ordering (same prefarance)
    if positive then o1 comes after o2
     */
    @Override
    public int compare(Integer o1, Integer o2){
        return o1 - o2; //sort in asc 5,3 5-3 =2 +ve so 3,5 as o1 comes after o2
    }
}

class Student {
    private String name;
    private double cgpa;
    public Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
}

public class MyComparator {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        // Using lambda expression
        words.sort((a,b) -> a.length() - b.length());//ASC
        System.out.println(words);
        words.sort((a,b) ->b.length() - a.length());//DSC
        System.out.println(words);
        list.sort(new TestComparator());
        System.out.println(list);

        //-=========================================-----------------
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.1));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("Akshit", 4.5));

        students.sort((o1,o2) -> {
//          (int) (o2.getCgpa()-o1.getCgpa())
            if(o2.getCgpa()-o1.getCgpa() > 1){
                return 1;
            }else if(o2.getCgpa() - o1.getCgpa()<0){
                return -1;
            }else{
                return 0;
            }
        });
        for(Student s: students){
            System.out.println(s.getName() + " : "+ s.getCgpa());
        }
    }
}
