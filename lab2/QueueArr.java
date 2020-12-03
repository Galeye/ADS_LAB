class QueueArr{
	final int max = 10;
	private int[] element = new int[max];
	private int size; //total no of the elements in the queue
	private int back;
	private int front;
	
	public QueueArr(){
		size = 0;
		back = -1;
		front = -1;
	}
	
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	//enqueue- to add element e to the back of the queue Q 
	public void enqueue(int n){
		back = back + 1;
		if(back>max){
			System.out.println("Overflow!");
		}
		else{
			element[back] = n;
			System.out.println(n+" is added to queue");
		}
		size = size + 1;
	}	
	//dequeue- to remove and return the first element from the queue
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			int start = 0;
			front ++;
			start = element[front];
			size --;
			System.out.println("The front number " +start+ " has been removed" );
		}
		return 1;
	}
	//first-to return reference to the front of the queue 
	public int first(){
		if(size == 0){
			return 0;
		}
		else{
			int start = 0;
			start = element[front + 1]; //as front is initialised as -1
			return start;
		}
	}
	//len(Q)enqueue -  to return the number of elements in the Q
	public int lenQenq(){
		return size;

	}
}