<<<<<<< HEAD
class StackLListTest{
	public static void main(String[] a){
		StackLList o = new StackLList();

		o.push(2);
		o.push(3);
		o.push(4);
		o.push(5);
		o.top();
		o.pop();
		
		assert(o.isEmpty()==false);
		assert(o.size()==3);
		
		System.out.println("The size of the stack is " +o.size());
		System.out.println("Congrats! All test cases passed");
		
	}
=======
class StackLListTest{
	public static void main(String[] a){
		StackLList o = new StackLList();

		o.push(2);
		o.push(3);
		o.push(4);
		o.push(5);
		o.top();
		o.pop();
		
		assert(o.isEmpty()==false);
		assert(o.size()==3);
		
		System.out.println("The size of the stack is " +o.size());
		System.out.println("Congrats! All test cases passed");
		
	}
>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
}