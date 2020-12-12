class keyIndex{
	public static int key(int[] arr){
		int R = 8; 
		int n = arr.length;
		int[] count = new int [R+1];
		int[] aux = new int[arr.length];
		//to compute frequency
		for (int i=0;i<n;i++){
			count [arr[i]+1]++;
		}
		//to transform count to indices
		for (int r=0;r<R;r++){
			count[r+1]+=count[r];
		}
		//distribute the data 
		for (int i=0;i<n;i++){
			aux[count[arr[i]]++] = arr[i];
		}
		//copy back
		for (int i=0;i<n;i++) {
			arr[i]=aux[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {6,2,3,4,2,1,7,5};
		key(arr);
		for (int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
}