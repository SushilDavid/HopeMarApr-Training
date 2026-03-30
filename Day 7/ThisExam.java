package HopeMarApr.LeetCode.Day7;

public class ThisExam {
    public  static void main(String[] args){
        Student s1=new Student("Sushil",1,90);
        s1.display();
    }
}
class Student {
    String name;
    int rollNo;
    int marks;
    public Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}