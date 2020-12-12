class LSDradix{
	public static void sort(String[] a, int w){
		//sort a[] on leading w characters
		int n = a.length;
		int R = 256;
		String[] aux = new String[n];
		for (int d=w-1;d>=0;d--){
			int[] count = new int[R+1];
		//compute frequency
		for (int i=0;i<n;i++){
			count[a[i].charAt(d)+1]++;
		}
		for (int r = 0;r<R;r++) {
			//transform count to indices
			count[r+1]+=count[r];	
		}
		for (int i=0;i<n;i++){
			//distribute
			aux[count[a[i].charAt(d)]++] = a[i];
		}
		for (int i=0;i<n;i++){
			//copy back
			a[i] = aux[i];
		}
		for (int i=0;i<n;i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		String[] a = {"Sonam","Karma","Dorji","James","Jonny","Jigmi"};
		int w = a[0].length();
		System.out.println(w);
		sort(a,w);
		
	}
}