// Write a java program to find the factorial of a number.

import java.util.Scanner;
class Factorial{
    int num;
    int result=1;
    Factorial(int n){
        num = n;
    }
    int output(){
        for(int i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }
}

public class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial nums = new Factorial(num);
        int res = nums.output();
        System.out.println(res);
    }
}