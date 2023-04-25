import java.util.*;
public class largestNoInArray {
    public static void largestNumber(int num[]){
        int largestNum = Integer.MIN_VALUE ;//largerst number find
        int smallestNum = Integer.MAX_VALUE;// Smallest number find
        for(int i=0; i < num.length; i++){
            if(num[i]>largestNum){
                largestNum =num[i];
            }
            if(num[i] < smallestNum){
                smallestNum = num[i];

            }
        }
        //print smallest number and index number
        System.out.print("The smallest number in this array is : "+ smallestNum + " ");
        for(int i=0; i<num.length; i++){
            if(num[i]==smallestNum){
                System.out.println("in index : "+i);
            }
        }
        System.out.println("\n");
        //print largest number and index number
        System.out.print("The largest number in this Array is : " +largestNum + " ");
        for(int i=0; i<num.length; i++){
            if(num[i] == largestNum){
                System.out.println("in index : " +i);
            }
        }
    }
    public static void main(String args[] ){
        Scanner sc = new Scanner (System.in);
        int number[] = new int[10];
        
        System.out.print("Enter your array elements : ");
        for(int i = 0; i <number.length; i++){
            number[i]=sc.nextInt();

        }
        System.out.println("Your Array's elements : ");
        for(int i =0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println("\n");
        largestNumber(number);
    }
    
}
