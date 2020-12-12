/**
     * Unit tests the {@code Graph} data type.
     * @param args the command-line arguments
     */
class graphTest{
    	public static void main(String[] args) {
        Graph obj = new Graph(7);
        obj.addEdge(1,2);
        obj.addEdge(3,4);
        obj.addEdge(4,6);
        System.out.println(obj.adj(2));
        System.out.println(obj.toString());
    }
}