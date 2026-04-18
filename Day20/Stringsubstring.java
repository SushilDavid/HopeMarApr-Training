package Day20;
import java.util.*;
public class Stringsubstring {
    public static void main(String[] args) {
        int count=0;
        String s="xyzzaz";
        for(int i=0;i<s.length()-2;i++){
            
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) ){
               count++;
            }
        }
        System.out.println(count);
        
    }
}
