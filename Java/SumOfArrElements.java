// Write a java program to find the sum of elements of an array.

import java.util.Scanner;
public class SumOfArrElements {
    public static void main(String args[]) {
        int sum=0;
        System.out.println("Enter the required size of the array ::");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements one by one");
        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.print("Sum of elements of an array: ");
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}