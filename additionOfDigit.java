import java.util.*;
public class additionOfDigit {

    public static void addDigit(int n){
        int number = n;
        int sum = 0;

        while (n > 0){
            int lastDigit = n %10;
            sum +=lastDigit;
        
            n /=10;
        }
        System.out.print("Sum of your digit " + number + " is = " + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        addDigit(num);
    }
    
}
