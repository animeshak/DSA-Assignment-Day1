//  Write a function that takes an array of integers as input and 
//  returns the second smallest element in the array.
import java.util.Scanner;
public class Ques7 {

    static void second(int arr[]){
        // System.out.println();
        int min = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int j = 0; j<arr.length; j++){
            if(min > arr[j]){
                min = arr[j]; 
            }
        }
        System.out.println("Minimum value from array is "+min);

        for(int k = 0; k<arr.length;k++){
            if(sec > arr[k] && arr[k] != min){
            sec = arr[k];
            }
        }
        System.out.println("The second min number is "+sec);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr [] = new int[size];

        Scanner elements = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i =0; i<size;i++){
        arr[i] = elements.nextInt();
        }
        second(arr);
        
    }
}