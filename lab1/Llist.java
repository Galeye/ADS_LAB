public class Llist{
		Node head;
		Node tail;
		int size;

		public Llist(){
			head = null;
			tail = null;
			size = 0;
		}
		// to get the size of the list
		public int size(){
			return size;
		} 
		//to see if the list is empty 
		public boolean isEmpty(){
			if (size == 0){
				return true;
			}
			return false;
		}
		//to get the first element of the list
		public int first(){
			return head.getElement();
		}
		// to get the last element of the list  
		public int last(){
			return tail.getElement();
		}
		//to add a new element to the front or head of the list
		public void addFirst(int n){
			Node newest = new Node(n, null);
			if(size == 0){
				head = newest;
				tail = newest;
			}
			else{
				newest.setNext(head);
				head = newest;
			}
			size = size + 1;
		}
		// to add a new element to the end or tail of the list
		public void addLast(int n){
			Node newest = new Node(n, null);
			if (size == 0){
				head = newest;
				tail = newest;
			}
			else{
				tail.setNext(newest);
				tail = newest;
			}
			size = size + 1;
		}
		// to remove and return the first element of the list
		public int removeFirst(){
			int deletedElement = head.getElement();
			if(size == 0){
				return 0;
			}
			else{
				head = head.getNext();
				size = size - 1;
			}
			return deletedElement;
		}

}
//Constructor
class Node{
	private int element;
	private Node next;
	public Node(int element, Node next){
		this.element = element; //'this' keyword is used infront of instance variable
		this.next = next;
	}

	//to get the element
	public int getElement(){
		return element;
	}
	//to get the address
	public Node getNext(){
		return next;
	}
	//to set the element of the node
	public void setElement(int n){
			element = n;
	}
	//to set the address of the node
	public void setNext(Node n){
		next = n;
	}
}