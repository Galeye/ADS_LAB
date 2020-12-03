public class LlistTest{
	public static void main(String[] args) {
		Llist obj1 = new Llist();
		
		
		obj1.addFirst(1);
		obj1.addlast(2);
		obj1.addlast(3);

		
		assert(obj1.isEmpty() == false);
		assert(obj1.size() == 3);
		assert(obj1.first() ==1);
		assert(obj1.last() == 3);
		assert(obj1.removeFirst() == 1);
		assert(obj1.size() == 4); 
		assert(obj1.first() ==2);
		System.out.println("All test cases passed");

	}
}
