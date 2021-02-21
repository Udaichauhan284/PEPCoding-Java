import java.util.*;
class Lcm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int lcm=(n>n1)?n:n1;
        while(true){
            if(lcm%n==0 && lcm%n1==0){
                System.out.println("The lcm of "+n+" and "+n1+" is "+lcm);
                break;
            }
            lcm++;
        }
        
    }
}