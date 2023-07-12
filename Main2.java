// 2 Write a function that takes an array of integers as
//  input and returns the largest element in the array.

import java.util.Scanner;

public class Main2 {

  static void addition(int[] input){
    int leng = input.length;
    int max = input[0]; 
    for(int i = 0; i < leng; i++){
      if(max < input[i]){
        max = input[i];
      }
      }

    System.out.println("Largest Elements of Array is "+max);

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
