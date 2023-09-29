import java.util.Scanner;

public class LastDigitOfNumber {
    public static void main(String[] args){
        int number, lastdigit,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        number = sc.nextInt();
        y = Math.abs(number);

        lastdigit = y%10;
        System.out.println("last digit"+lastdigit);
    }
}
