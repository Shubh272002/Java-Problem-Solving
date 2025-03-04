

class maxnum{
	public static void main(String[] args){
		int arr[]= new int[]{2,3,5,6,10,20,50}; 
		int max =arr[0]; int min=arr[0];
		
		
		for(int x:arr){
			if(x>max){
				max=x;
			}
			if(min>x){
				min=x;
			}
		}
		System.out.println("\nMax Value ="+max+  "\nMin Value ="+min);
		
	}
}