public class QueueArrTest{
	public static void main(String[] a){
		QueueArr x = new QueueArr();

		x.enqueue(1);
		x.enqueue(2);
		x.enqueue(3);
		x.dequeue();
		x.first();
		x.lenQenq();

		assert(x.isEmpty()==false);
		System.out.println(x.first()+" is the front number");
		System.out.println("Congratulation! All test cases passed.");
	}
}