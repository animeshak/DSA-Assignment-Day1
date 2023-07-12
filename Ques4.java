// Write a function that takes an array of integers as input and 
// returns the average of the numbers in the array.
import java.util.Scanner;

public class Ques4 {

  static void addition(int[] input){
    int total = 0;
    int leng = input.length;
    for(int i = 0; i < leng; i++){
      total = total + input[i];
      }
    int avg = total/leng;

    System.out.println("Average of the Elements of Array is "+avg);

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
          addition(array);
}
}