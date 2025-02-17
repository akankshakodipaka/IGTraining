// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    int rollno;
    String fname;
    Student(int rollno, String fname)
    {
        this.rollno=rollno;
        this.fname=fname;
    }
    void modify(int n)
    {
        n=n+1;
        System.out.println("Inside integer method "+n);
    }
    void modify(Student s)
    {
        s.rollno=s.rollno+1;
        System.out.println("Inside Student method "+s.rollno); 
    }
    void modify(String name)
    {
        name="NewName";
        System.out.println("Inside String method "+name);
    }
}
class Q4{
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int n=10;
        Student student = new Student(201,"Akanksha");
        String name="Name";
        System.out.println("Before modify():");
        System.out.println("Number: "+n);
        System.out.println("Student rollno: "+student.rollno);
        System.out.println("Student fname: "+student.fname);
        System.out.println("name : "+name);
        Student obj=new Student(0,"");
        obj.modify(n);
        obj.modify(student);
        obj.modify(name);
        System.out.println("After modify():");
        System.out.println("Number: "+n);
        System.out.println("Student rollno: "+student.rollno);
        System.out.println("Student fname: "+student.fname);
        System.out.println("name : "+name);
        
        
    }
}