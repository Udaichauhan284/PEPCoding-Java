//print fibonaccoSeries till N

import java.util.*;
class fibonacciSeries{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t0=0;
		int t1=1;
		int t3;
		System.out.println(t0);
		System.out.println(t1);
		for(int i=2;i<n;i++){
			t3=t0+t1;
			System.out.println(t3);
			t0=t1;
			t1=t3;
		}
	}
}