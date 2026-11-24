package Day02_Loops;

public class LeetCode1281 {
    public static void main(String[] args)
    {
        int n=234;
        int sum=0;
        int product=1;
        while(n>0)
        {
             int digit =n%10; 
             sum = sum + digit;
             product = product * digit;
             n = n / 10;
        }
         int answer = product - sum;
        System.out.println(answer);
    }
    
}
