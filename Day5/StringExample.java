package Day5;

public class StringExample {
    public static void main(String[] args) {
        String s="Hello this is Surya";
        String[] words=s.split(" ");
       System.out.println(words[words.length-1].length());    
       char[] ch=s.toCharArray();           
    }
}
