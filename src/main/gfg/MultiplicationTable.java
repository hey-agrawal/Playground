import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i<11){
            System.out.print(n +"x"+ i+"=");
            System.out.println(i*n);
            i = i+1;
        }
    }
}
