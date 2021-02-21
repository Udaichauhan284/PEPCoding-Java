import java.util.*;
class palindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String org_str=str;
        String rev="";
        int len=str.length(); //length() for string and length is for knowing the length of array
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(org_str+" is palindrome");
        }
        else{
            System.out.println(org_str+" is not palindrome");
        }

    }
}