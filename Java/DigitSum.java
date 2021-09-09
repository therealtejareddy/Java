// Write a java program to find the sum of digits of a given number.

import java.util.Scanner;
public class DigitSum {
    public static void main(String args[]) {
        int sum=0;
        int digit;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number>0){
            digit = number % 10;
            sum+=digit;
            number = number/10;
        }
        System.out.println(sum);
    }
}