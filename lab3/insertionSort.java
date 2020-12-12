<<<<<<< HEAD
public class insertionSort{
	int[] Sort(int[] arr){
		int n =arr.length;
		for (int i=1; i<=n-1;i++){
			for (int j =i; j>0 && compare(j-1,j,arr);j--){
					swap(arr,j-1,j);
				}	
			}
			return arr;
		} 

	boolean compare(int a, int b, int[] arr){  //to compare the values
		if (arr[a]>arr[b]){
			return true;
		}
		return false;
	}
	void swap(int[] arr, int a, int b){ //to swap the values
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] =temp;
	}

	public static void main(String[] args){
		int[] arr = {6,5,3,4,2,8,9};
		for (int i = 0; i<arr.length; i++) //to print out the unsorted array
		System.out.print(arr[i]+" ");
		System.out.println("");
		insertionSort obj = new insertionSort();
		int[] ans=obj.Sort(arr);
		for (int i=0; i<arr.length ;i++ ) {
			System.out.print(ans[i]+" ");
		}
	}	
=======
public class insertionSort{
	int[] Sort(int[] arr){
		int n =arr.length;
		for (int i=1; i<=n-1;i++){
			for (int j =i; j>0 && compare(j-1,j,arr);j--){
					swap(arr,j-1,j);
				}	
			}
			return arr;
		} 

	boolean compare(int a, int b, int[] arr){  //to compare the values
		if (arr[a]>arr[b]){
			return true;
		}
		return false;
	}
	void swap(int[] arr, int a, int b){ //to swap the values
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] =temp;
	}

	public static void main(String[] args){
		int[] arr = {6,5,3,4,2,8,9};
		for (int i = 0; i<arr.length; i++) //to print out the unsorted array
		System.out.print(arr[i]+" ");
		System.out.println("");
		insertionSort obj = new insertionSort();
		int[] ans=obj.Sort(arr);
		for (int i=0; i<arr.length ;i++ ) {
			System.out.print(ans[i]+" ");
		}
	}	
>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
}