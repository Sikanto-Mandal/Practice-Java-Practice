import java.util.*;
public class binaryToDecimal {
    public static void binToDec(int n){
        int number = n;
        int pow = 0;
        int decimalNumber = 0;

        while(n > 0){
            int lastDigit = n %10;
            decimalNumber = decimalNumber + (lastDigit *(int) Math.pow(2,pow));
            pow ++;
            n /=10;
        }
        System.out.print(decimalNumber);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");

        int num = sc.nextInt();
        System.out.print("Your binary number of " + num + " in decimal is = " );
        binToDec(num);

    }
    
}
