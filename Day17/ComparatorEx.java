package Day17;
import java.util.Comparator;
public class ComparatorEx {
    static class Student {
        String name;
        int rollNo;
        int marks;

        public Student(String name, int rollNo, int marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        } 
        public String toString() {
            return name + ": " + rollNo + ", Marks: " + marks;
        }
    }

    public static void main(String[] args) {
        Comparator<Student> studentComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.marks, s2.marks);
            }
        };
        Student student1 = new Student("Alice", 1, 85);
        Student student2 = new Student("Bob", 2, 90);
        int result = studentComparator.compare(student1, student2);

    }

 class Student1 {
    String name;
    int rollNo;
    int marks;

    public Student1(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    } 
    public String toString() {
        return name + ": " + rollNo + ", Marks: " + marks;
    }
}}
