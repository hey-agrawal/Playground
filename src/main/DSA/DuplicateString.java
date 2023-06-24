import java.util.*;

public class DuplicateString {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int[] count = new int[256];
        for (int i = 0; i < count.length; i++){
            count[s1.charAt(i)]++;
        }
        for(int i = 0; i <256; i++){
            if(count[i]>1){
                System.out.println((char)(i)+"count ="+count[i]);
            }
        }
        
    }
}
