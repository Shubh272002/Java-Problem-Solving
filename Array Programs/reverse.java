import java.util.Scanner;

class reverse{
	public static void main(String args[]){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number Series:-");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("\nArray Elements:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.print("Array Reverse Elements:");
		for(int i=5-1;i>=0;i--){
			System.out.println(arr[i]+" ");
		}
	}
}