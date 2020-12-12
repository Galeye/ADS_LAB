<<<<<<< HEAD
public class selectionSort{
	
	public int[] sort(int[] arr){
		int i,j,minElement,minIndex;
		int n= arr.length;
		for (i = 0;i < n;i++){
			minElement = arr[i]; //assigning minimum value to arr[i]
			minIndex= i; //assigning index to the i
			for (j=i;j<n;j++){
				if (minElement>arr[j]){ //comparing min value with arr[j] 
					minElement = arr[j];//minimum value is assigned to arr[j]
					minIndex = j; //minimum index is assigned to arr[j]
				}
			}
		if(minElement<arr[i]){ //the minimum value from the inside loop will be compared with arr[i]
			int tmp = arr[i]; //storing arr[i] in temporary variable
			arr[i] = arr[minIndex]; 
			arr[minIndex] = tmp;
		}
			
		}
		return arr;
	}
	

	public static void main(String[] args){
		int[] arr = {8,6,7,4,4,3};
		System.out.println("The unsorted array:");
		for (int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		selectionSort obj = new selectionSort();
		int[] sortedArr = obj.sort(arr);
		System.out.println("Selection Sorted array:");
		for (int i=0;i<arr.length;i++){
		 	System.out.print(sortedArr[i]+" ");
		 } 

	}

=======
public class selectionSort{
	
	public int[] sort(int[] arr){
		int i,j,minElement,minIndex;
		int n= arr.length;
		for (i = 0;i < n;i++){
			minElement = arr[i]; //assigning minimum value to arr[i]
			minIndex= i; //assigning index to the i
			for (j=i;j<n;j++){
				if (minElement>arr[j]){ //comparing min value with arr[j] 
					minElement = arr[j];//minimum value is assigned to arr[j]
					minIndex = j; //minimum index is assigned to arr[j]
				}
			}
		if(minElement<arr[i]){ //the minimum value from the inside loop will be compared with arr[i]
			int tmp = arr[i]; //storing arr[i] in temporary variable
			arr[i] = arr[minIndex]; 
			arr[minIndex] = tmp;
		}
			
		}
		return arr;
	}
	

	public static void main(String[] args){
		int[] arr = {8,6,7,4,4,3};
		System.out.println("The unsorted array:");
		for (int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		selectionSort obj = new selectionSort();
		int[] sortedArr = obj.sort(arr);
		System.out.println("Selection Sorted array:");
		for (int i=0;i<arr.length;i++){
		 	System.out.print(sortedArr[i]+" ");
		 } 

	}

>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
}