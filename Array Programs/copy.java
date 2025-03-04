import java.util.Scanner;

class copy{
	public static void main(String [] args){
		int arr[]=new int[5];
		int arr1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:-");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("First Array Element:");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nSecond Elements:");
		for(int i=0;i<5;i++){
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" ");
		}
		
	}
	}