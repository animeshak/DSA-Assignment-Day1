// Write a function that takes a string as input and returns whether it is a palindrome or not.
import java.util.Scanner;
public class Ques6 {

static void palidrome(String pali){
    int size = pali.length();
    boolean yes = true;
    for(int i=0, j = size-1; i <size && j>0; i++,j--){
        if(pali.charAt(i) != pali.charAt(j)){
            yes = false;
            break;
        }
    }
        if(yes == true){
        System.out.println("Yes "+pali+" is a palidrome");
        
        }
        else{
            System.out.println("No "+pali+" is not a palidrome");
        }
    
}

public static void main(String[] args) {  
    Scanner str = new Scanner(System.in);
    System.out.println("Enter the string .");
    String pali = str.next();
    palidrome(pali);
}   
}