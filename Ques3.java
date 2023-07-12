//  Write a function that takes a number as input and returns whether it is prime or not.
import java.util.Scanner;

public class Ques3 {

static void addition(int[] input){
    
    int leng = input.length;
    
    for(int i = 0; i < leng; i++){
        int num = input[i];

        if(num != 0 || num != 1){
            boolean x = true;
            for(int j = 2; j< num; j++){
                if(num%j == 0){
                     x = false;
                }
                
            }
            if(x == true){
                System.out.println("Prime Numbers are "+num);
            }
        }
    }
        
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
