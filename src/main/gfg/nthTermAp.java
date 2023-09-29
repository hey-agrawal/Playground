import java.util.Scanner;

public class nthTermAp {
    public static void main(String[] args){
        int a , n, d, nth;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first term");
        a = sc.nextInt();
        System.out.println("Enter the difference");
        d = sc.nextInt();
        System.out.println("Enter the value of n");
        n = sc.nextInt();

        nth = a+(n-1)*d;

            System.out.println("nth term is"+nth);

    }
}
