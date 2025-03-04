import java.util.Scanner;

class findaver{
	public static void main(String [] arg){
		int arr[] = new int[5];  int sum=0; double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Numbers:-");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Numbers: ");
		for( int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<5;i++)
		{
			sum = arr[i]+sum;
		}
		
		avg = sum/5.0;
		System.out.print("\n Addition:" +sum+" Average:"+avg);
		
	}
}