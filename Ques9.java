// Write a function that takes an array of integers as input and prints the elements in reverse order.
import java.util.ArrayList;
import java.util.Scanner;
public class Ques9 {

    static void reverse(int array[]){

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int j = array.length-1; j>=0 ; j--){
            arr2.add(array[j]);
        }
        System.out.println(arr2);
    }

    public static void main(String[] args) {
        int n;    

        System.out.println("Enter the size of Array.");  
        Scanner size = new Scanner(System.in);
        n = size.nextInt();
        int[] array = new int[n]; 

        
        System.out.println("Enter the elements of the array: ");  
          Scanner sc = new Scanner(System.in);

          for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
          }  
          reverse(array);

    }
}
