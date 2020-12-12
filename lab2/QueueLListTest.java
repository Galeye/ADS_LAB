public class QueueLListTest{
	public static void main(String[] a){
		QueueLList x = new QueueLList();

		x.enqueue(1);
		x.enqueue(3);
		x.enqueue(4);
		x.dequeue();
		x.enqueue(2);
		x.first();
		x.lenQenq();

		assert(x.isEmpty()==false);
		assert(x.lenQenq()==3);

		System.out.println("The front number = " +x.first());
		System.out.println("The total no of elements = " +x.lenQenq());
		System.out.println("Congratulation! All test cases passed.");
	}
}