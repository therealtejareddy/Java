// Write a java program to find the sum of N even numbers.

class SumOfNEvens{
    int num;
    int result=0;
    int count=0;
    SumOfNEvens(int n){
        num = n;
    }
    int output(){
        for(int i=0;i<=num;i++){
            result+=count;
            count+=2;
        }
        return result;
    }
}

public class EvenSum {
    public static void main(String args[]) {
        SumOfNEvens nums = new SumOfNEvens(100);
        int res = nums.output();
        System.out.println(res);
    }
}