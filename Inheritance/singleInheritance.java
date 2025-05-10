class Student {
    public String name;
    public String dob;
    public String phoneNo;

    public Student(String name, String dob, String phoneNo) {
        this.name = name;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }
    public void hi() {
        System.out.println("Hi I am a Student");
    }
}

class CSEStudent extends Student {
    public String rollNo;
    public int semester;

    public CSEStudent(String name, String dob, String phoneNo, String rollNo, int semester){
        super(name,dob,phoneNo);
        this.rollNo = rollNo;
        this.semester = semester;
    }
    @Override
    public void hi() {
        System.out.println("Hi I am a CSE Student");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        Student s1 = new Student("abc", "12/12/2003", "1234567890");
        CSEStudent s2 = new CSEStudent("xyz", "03/04/2005", "1234567890", "CSE1234", 3);
        s1.hi();
        s2.hi();
    }
}
