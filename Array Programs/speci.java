import java.util.Scanner;

class speci{
	public static void main(String[] args){
		int arr[] = new int[5];
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Numbers:-");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Array  Elements");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("\nEnter Search Element:");
		n= sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n){
				count++;
			}
		}
		if(count>0)
			System.out.print("Item Found "+count+" times");
		else
			System.out.print("Item Not Found");
	}
}