<<<<<<< HEAD
/* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
    class SolutionTest{
    	public static void main(String[] args) { 
        	Solution<Integer, String> tree= new Solution<Integer, String>();
        	tree.put(4,"Hello");
        	tree.put(6,"Bonjour");
        	tree.put(5,"Kon'nichiwa");
        	tree.put(8,"Hola");

        	assert(tree.isEmpty()==false);
        	assert(tree.min()==4);
        	assert(tree.floor(7)==6);
        	System.out.println(tree.keys(4,6));
        	System.out.println("The size of the tree is: " +tree.size());
        	System.out.println("You have selected "+tree.select(1));
        	System.out.println("The value you want to get = " +tree.get(9));
        	System.out.println("Floor = " +tree.floor(7));
        	System.out.println("Min = " +tree.min());
        	System.out.println("Max = " +tree.max());
        	
    	}	
    }
=======
/* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
    class SolutionTest{
    	public static void main(String[] args) { 
        	Solution<Integer, String> tree= new Solution<Integer, String>();
        	tree.put(4,"Hello");
        	tree.put(6,"Bonjour");
        	tree.put(5,"Kon'nichiwa");
        	tree.put(8,"Hola");

        	assert(tree.isEmpty()==false);
        	assert(tree.min()==4);
        	assert(tree.floor(7)==6);
        	System.out.println(tree.keys(4,6));
        	System.out.println("The size of the tree is: " +tree.size());
        	System.out.println("You have selected "+tree.select(1));
        	System.out.println("The value you want to get = " +tree.get(9));
        	System.out.println("Floor = " +tree.floor(7));
        	System.out.println("Min = " +tree.min());
        	System.out.println("Max = " +tree.max());
        	
    	}	
    }
>>>>>>> ac3cd2cc31d598c983550fc86fa1cd8614b433c6
    