import java.util.Scanner;

class sumarr{
	public static void main(String args[]){
		int arr[]= new int[5]; int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Numbers :-");
		
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
			}
			
			System.out.print("Array Elements" );
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			sum = arr[i]+sum;
		}
		System.out.println("\nAddition Of Array Elements :-"+sum);
			
		
	}
}