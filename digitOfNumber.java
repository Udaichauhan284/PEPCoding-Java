//digit of the number

import java.util.*;
class digitOfNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int nod=0;
		while(temp!=0){
			temp=temp/10;
			nod++;
		}
		int div=(int)Math.pow(10,nod-1);
		while(div!=0){
			int q=n/div;
			System.out.println(q);

			n=n%div;
			div=div/10;
		}
	}
}

//i/p 4568923
//o/p 
//4
//5
//6
//8
//9
//2
//3