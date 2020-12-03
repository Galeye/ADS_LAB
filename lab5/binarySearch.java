class binarySearch{
	
	public static int search(int[] arr, int left, int right, int x){
		if(right>=left){
			int mid = (right+left)/2;
			if(arr[mid]==x){
				return mid;
			}
			else if(arr[mid]>x){
				return search(arr,left,mid-1,x);
			}
			else{
				return search(arr,mid+1,right,x);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,7,8,8,9,10};
		int n = arr.length;
		int x = 7;
		int r = search(arr,0,n-1,x);
		if(r==0){
			System.out.println("Element not in the list");
		}
		else{
			System.out.println("Element is at the index "+r);
		}

	}
}