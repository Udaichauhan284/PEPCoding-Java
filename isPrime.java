import java.util.*;
class isPrime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int div=2;
			while(div *div <=n){
				if(n%div == 0){
					break;
				}
				div++;
			}
			if(div*div>n){
				System.out.println("Prime Number");
			}
			else{
				System.out.println("Non Prime Number");
			}
		}
	}
}