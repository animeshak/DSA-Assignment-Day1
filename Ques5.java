// Write a function that takes an array of integers as input and 
// returns the number of even and odd elements in the array
import java.util.ArrayList;
import java.util.Scanner;

public class Ques5 {

  static void addition(int[] input){
    int leng = input.length;
    ArrayList<Integer> eve = new ArrayList<Integer>();
    ArrayList<Integer> odo = new ArrayList<Integer>();
    
    for(int i = 0; i < leng; i++){
      int num = input[i];
      if(num%2 == 0){
        eve.add(num);
      }
      else{
        odo.add(num);
      }
      }
      System.out.println(eve);
      System.out.println(odo);


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