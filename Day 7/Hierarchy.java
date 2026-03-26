package HopeMarApr.LeetCode.Day7;

public class Hierarchy {
    public static void main(String[] args) {
        Son  s=new Son();
        s.display();
        s.job();
        Daughter d=new Daughter();
        d.display();
        d.buisness();
        
    }
}
class Father{
        void display(){
            System.out.println("I have Father and I have one son and one daughter");
        }
}
class Son extends Father{
       void job(){
             System.out.println("I am Son and I am working in a job");
       }

}
class Daughter extends Father{
    void buisness(){
          System.out.println("I am Daughter and I have a buisness");
    }
}