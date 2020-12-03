class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
	public int getData(){
		return data;
	}
	public void setData(int data){
		this.data = data;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next = next;
	}

}
public class QueueLList{
 	private Node front; //elements are removed from the front
	private int size;
	private Node back; // elements are added from the back
	public QueueLList(){
		size = 0;
		front = null;
		back = null;
 }
 	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}
	public void enqueue(int ele){
		Node newest = new Node(ele);
		if(front == null){
			front = newest;
			back = newest;
		}
		else{
			back.setNext(newest);
			back = newest;
			//System.out.println(" has been added" +back.getData());
			
		}	
		size ++;
	}
	public int dequeue(){
		int tmp = front.getData();
		if(size == 0){
			System.out.println("Nothing to dequeue!");
			
		}
		else{
			front = front.getNext();
			size --;
		}
		return tmp;
	}
	public int first(){
		if (size == 0){
			System.out.println("Error!Nothing to display!");
		}
		return front.getData();
	}

	public int lenQenq(){
		return size;
	}
}

