public class mergeSort{

    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = arr[k]; 
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if(i > mid){
                arr[k] = aux[j++];
            }              
            else if(j > hi) {
                arr[k] = aux[i++];
            }                
            else if (less(aux[j], aux[i])) {
                arr[k] = aux[j++];
            }
            else {
                arr[k] = aux[i++];
            }
        }
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(int[] arr, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid + 1, hi);
        merge(arr, aux, lo, mid, hi);

    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        int lo = 0;
        int hi = arr.length - 1;

        sort(arr,aux,lo,hi);
    }


   /***************************************************************************
    *  Helper sorting function.
    ***************************************************************************/

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(int[] arr) {
        return isSorted(arr, 0, arr.length - 1);
    }

    private static boolean isSorted(int[] arr, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(arr[i], arr[i-1])) {
                return false;
            }
        return true;
    }

    // print array to standard output
    private static void show(int[] arr) {
        System.out.println("\nSorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    /**
     * Reads in a sequence of strings from standard input; mergesorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5,8,1,2,3,1};
        System.out.println("Unsorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        mergeSort.sort(arr);
        show(arr);
    }
}