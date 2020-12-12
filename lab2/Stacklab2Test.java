public class Stacklab2Test{
	public static void main(String[] args){
		Stacklab2 obj = new Stacklab2();

		obj.push(1);
		obj.push(3);
		
		assert(obj.isEmpty() == false);
		assert(obj.size() == 2);
		assert(obj.pop() == 3);
		System.out.println("All test cases passed");
		
	}	
}