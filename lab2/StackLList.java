<<<<<<< HEAD
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data =  data;
		next = null;
	}
}
public class StackLList{
	private Node top;
	private int size;
	public StackLList(){
		top = null;
	}
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		return false;
	}
	public void push(int data){
		Node newest = new Node(data);
		newest.next = top;
		top = newest;
		size = size + 1;
	}
	public int size(){
		return size;
	}
	public int pop(){
		if(size == 0){
			System.out.println("It's an empty Stack!");
		}
		else{
			Node tmp = top;
			top = top.next;
			size = size - 1;
			System.out.println("You popped " +tmp.data);	
		}
		return 1;
	}
	public int top(){
		if(isEmpty()){
			return 0;
		}
		else{
			System.out.println("The top is "+top.data);
		}
		return 1;
		
	}
=======
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data =  data;
		next = null;
	}
}
public class StackLList{
	private Node top;
	private int size;
	public StackLList(){
		top = null;
	}
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		return false;
	}
	public void push(int data){
		Node newest = new Node(data);
		newest.next = top;
		top = newest;
		size = size + 1;
	}
	public int size(){
		return size;
	}
	public int pop(){
		if(size == 0){
			System.out.println("It's an empty Stack!");
		}
		else{
			Node tmp = top;
			top = top.next;
			size = size - 1;
			System.out.println("You popped " +tmp.data);	
		}
		return 1;
	}
	public int top(){
		if(isEmpty()){
			return 0;
		}
		else{
			System.out.println("The top is "+top.data);
		}
		return 1;
		
	}
>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
}