import java.util.*;
public class linearSearch {
    public static  int  linear(int num[], int key){
        for (int i = 0; i <num.length; i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.print("Enter your key : ");
        int key = sc.nextInt();
        int index =linear(number,key);

        if (index == -1){
            System.out.print("Element is not found! " + key );
        }
        else {
            System.out.print("your Element is in  index = " + index);
        }

        }
    }
    

