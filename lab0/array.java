public class array {
    static int[] a; //global variable
    public static int[] resize(int length){
        int[] tmp = new int[length];
        for (int i=0; i<a.length; i++){
            tmp[i] = a[i]; 
        }
        tmp[length-1] = 4;
        a= tmp;
        return a;
    }


    public static void main(String[] args){
        a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] new_a = resize(4);
        for(int i=0; i<new_a.length; i++)
        System.out.println(a[i]);
    }
}