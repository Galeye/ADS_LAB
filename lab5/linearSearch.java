class linearSearch{

	public static int search(int[] arr, int x){
		int n =arr.length;
		for (int i=0;i<n;i++ ) {
			if(arr[i]==x){
				System.out.println(arr[i]);
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {5,6,3,4,7,8};
		int x=4;
		int r = search(arr,x);
		if(r==0){
			System.out.println("Element is not in the list");
		}
		else
			System.out.println("Element is present at the index "+r);

	}
}