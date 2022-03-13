class student{
   
    private String name;
    private long id;
    final static String COLLEGE="Fullerton";

    student(String name,long id)
    {
        this.name=name;
        this.id=id;
    }
    static void demoStaticMethod()
    {
        System.out.println("This demo is a static method");
        System.out.println(student.COLLEGE);
    }
    void demoObjectMethod()
    {
        System.out.println("This demo is a non static method");
        System.out.println(student.COLLEGE);
        System.out.println("Name: "+this.name+"Id: "+this.id);
    }
}
    public class StudentDemo {
        public static void main(String args[])
        {
         student s1=new student("Wyle Cyoto",456);
         student.demoStaticMethod();
         s1.demoObjectMethod();
        }
    
        
    }

