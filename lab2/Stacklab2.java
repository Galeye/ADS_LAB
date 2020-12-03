class Stacklab2{
	final int max = 10;
	private int[] element = new int[max];
	private int size;
	private int top;


	public Stacklab2(){
		size = 0;
		top = -1; 
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	//to add element e to the top of the stack 
	public void push(int e){
		top = top+1;
		if(top > max){
			System.out.println("overflow!");
		}
		else{
			element[top] = e;
			System.out.println(e+ "Push");
		}
		size = size + 1;
	}
	//to remove and return the top element from the stack
	public int pop(){
		
		if (top < 0){
			System.out.println("underflow!");
		}
		else{
			size = size - 1;
			top = top - 1;
		}
		return element[top + 1];

	}
	//to return the top element of the stack without removing it
	public int top(){
		if (size == 0){
			return 0;
			
		}
		else{
			return element[top];
			
		}
	}
	//to return the number of the elements in the stack
	public int size(){
		return size;
	}
	
}

