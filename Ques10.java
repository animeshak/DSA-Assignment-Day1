// Write a function that takes a number as input and prints the Fibonacci series up to that number.

import java.util.Scanner;
public class Ques10 {
    static void Fibo(int fact){
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print("Fibonacci number upto"+fact+" is 0 1 ");
        for(int i = 0; i< fact; i++){
            n3 = n2 + n1;
            if(n3<=fact){
            System.out.print(n3+"  ");
            n1 = n2;
            n2 = n3;
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of ");
        int fact = sc.nextInt();
        Fibo(fact);
    }
}
