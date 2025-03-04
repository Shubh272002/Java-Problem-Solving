import java.util.Scanner;

class remove{
	public static void main(String arg[]){
	int size,loc,i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Array Size:-");
	size=sc.nextInt();
	
	int arr[]= new int[size];
	System.out.print("\nEnter Array Elements:");
	for(i=0;i<size;i++){
		arr[i] = sc.nextInt();
	}
	System.out.print("Enter Array Location: ");
	loc=sc.nextInt();
	
	for(i=loc;i<size-1;i++){
		arr[i+1] = arr[i-1];
	}
	size--;
	for(i=0;i<size;i++){
		System.out.print(arr[i]+" ");
	}
}
}