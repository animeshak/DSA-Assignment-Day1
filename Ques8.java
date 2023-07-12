// Write a function that takes a number as input and returns the factorial of that number.
import java.util.Scanner;
public class Ques8 {
    static void Factorial(int fact){
        int torial = 1;
        for(int i = fact; i>0; i--){
            torial = torial * i;
        }
        System.out.println("Factorial of "+fact+" is "+torial);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of ");
        int fact = sc.nextInt();
        Factorial(fact);
    }
}
