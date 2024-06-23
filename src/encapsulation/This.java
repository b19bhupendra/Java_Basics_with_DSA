package encapsulation;
    class Student1
    {
        private int age;
        private String name;

        public void setData1(int age)
        {
            this.age = age;
        }

        public void setData2(String name)
        {
            this.name=name;
        }
        public void show()
        {
            System.out.println(name+ " " +age);
        }
    }
    public class This
    {

        public static void main(String[] args)
        {
            // TODO Auto-generated method stub
            Student1 obj=new Student1();
            Student1 obj1=new Student1();

            obj.setData1(18);
            obj.setData2("Navin");
            obj1.setData1(25);
            obj1.setData2("Kiran");
            obj.show();
            obj1.show();
        }

    }