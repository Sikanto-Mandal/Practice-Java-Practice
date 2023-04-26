import java.util.*;
public class binarySearch {
    public static int search(int num[], int key){
        int start = 0, end = num.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if (num[mid] == key){
                return mid;

            }
            if(num[mid] < key){
                return mid+1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your key : ");
        int key =sc.nextInt();

        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.print("Your index nubmer is : "+search(number, key));
        }
    
}
