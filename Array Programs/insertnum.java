import java.util.Scanner;


class insertnum{
	public static void main(String [] args){
		int size,loc,item,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array Size:-");
		size = sc.nextInt();
		
		int arr[] = new int[size+1];
		System.out.print("Enter Array Element:");
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Array Location:");
		loc= sc.nextInt();
		System.out.print("Enter New Item:");
		item = sc.nextInt();
	}
}