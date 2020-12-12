public class Quick {

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
            int n=a.length;
            sort(a,0,n-1);
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(int[] a, int lo, int hi) { 
        if(lo>=hi)return;
        int p = partition(a,lo,hi);
        sort(a,lo,p-1);
        sort(a,p+1,hi);
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1, pivot = a[lo];
        while(true){
            while(less(a[++i],pivot))
                if(i==hi)break;
            while(less(pivot,a[--j]))
                if(j==lo)break;

            if(i>=j)break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;

    }



   /***************************************************************************
    *  Helper sorting functions.
    ***************************************************************************/

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        if(v==w) return false;
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] =a[j];
        a[j]=tmp;
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(int[] a) {
           return isSorted(a, 0, a.length-1);
    }

    private static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo+1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }


    // print array to standard output
    private static void show(int[] a) {
        System.out.print("\nsorted array:");
        for (int i = 0; i <a.length; i++)
            System.out.print(" "+a[i]);
    }

    /**
     * Reads in a sequence of values ; quicksorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] a = {7,8,4,5};
        System.out.print("\n unsorted array:");
        for (int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        Quick.sort(a);
        show(a);
        assert isSorted(a);

    }

} 