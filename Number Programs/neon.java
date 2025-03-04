import java.util.Scanner;

class neon{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,p,rev,s=0;
		System.out.println("Enter Your Number:-");
		n=sc.nextInt();
		p=n*n;
		while(p>0){
			rev =p%10;
			s=s+rev;
			p=p/10;
		}
		if(n==s)
			System.out.println("This Is A NEON Number!!");
		else
			System.out.println("This Is Not a NEON Number!!");
	}
}