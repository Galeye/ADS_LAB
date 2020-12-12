<<<<<<< HEAD
public class bubbleSort{
	int[] sort(int[] arr){
		int n = arr.length;
		int i,j,swapCounter=-1;
		for (i=0;i<n;i++){
			for (j=0;j<n-1-i;j++){  //-i so that already compared elements are not compared again.
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					swapCounter++; //swap counter increasing from -1;
				}
			}
			if(swapCounter==0){//to break at 0 and reset it 
				break;
			}
		}
		return arr;
	}
	void swap(int[] arr,int a, int b){
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] =tmp;
	}
	public static void main(String[] args){
		int[] arr = {10,8,7,5,6,4,8,9};
		System.out.println("Unsorted array:");
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");	
		System.out.println(" ");
		bubbleSort obj = new bubbleSort();
		int[] bubble = obj.sort(arr);
		System.out.println("Sorted array: ");
		for (int i=0;i<arr.length;i++){
			System.out.print(bubble[i]+" ");
		}


	}
=======
public class bubbleSort{
	int[] sort(int[] arr){
		int n = arr.length;
		int i,j,swapCounter=-1;
		for (i=0;i<n;i++){
			for (j=0;j<n-1-i;j++){  //-i so that already compared elements are not compared again.
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					swapCounter++; //swap counter increasing from -1;
				}
			}
			if(swapCounter==0){//to break at 0 and reset it 
				break;
			}
		}
		return arr;
	}
	void swap(int[] arr,int a, int b){
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] =tmp;
	}
	public static void main(String[] args){
		int[] arr = {10,8,7,5,6,4,8,9};
		System.out.println("Unsorted array:");
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");	
		System.out.println(" ");
		bubbleSort obj = new bubbleSort();
		int[] bubble = obj.sort(arr);
		System.out.println("Sorted array: ");
		for (int i=0;i<arr.length;i++){
			System.out.print(bubble[i]+" ");
		}


	}
>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
}