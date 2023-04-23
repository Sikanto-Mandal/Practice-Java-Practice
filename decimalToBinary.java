import java.util.*;
public class decimalToBinary {
    public static void decToBin(int n){
       int binaryNumber = 0;
       int pow = 0;
       int number = n;

       while(n > 0){
        int lastDigit = n % 2;
        binaryNumber += (lastDigit* Math.pow (10, pow));
        pow ++;
        n /= 2;
       }
       System.out.print("Your decimal number " + number + " in Binary is = " + binaryNumber);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter you decimal number : ");

        int num = sc.nextInt();
        decToBin(num);
    }
    
}
