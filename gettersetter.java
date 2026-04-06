package Day10;

public class gettersetter {
    public static void main(String[] args) {
        Name n=new Name();
        n.setName("John");
        System.out.println(n.getName());
    }
    
}
class Name{
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
