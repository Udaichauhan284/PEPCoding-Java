import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10; //geting remainder
            sum=(sum*10)+r;
            temp=temp/10;
        }
        if(n==sum){
            System.out.println(n+" is palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }
    }
}