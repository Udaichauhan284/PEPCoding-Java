//print the digit in number n=562348 o/p: 6

import java.util.*;
class countDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}