public class sequentialTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("Galey",12190051);
		obj.put("Sonam",12190067);
		obj.put("Deki",12356678);
		obj.put("Lhamo",12103485);
		obj.delete("Deki");
		obj.put("Dorji",12356223);
		System.out.println(obj.keys());

		assert(obj.size()==4);
		assert(obj.contains("Galey"));
        System.out.println(obj.isEmpty());
        System.out.println(obj.contains("sad"));
        System.out.println(obj.get("Pema"));
        System.out.println(obj.keys());
        System.out.println(obj.size());



	}
}