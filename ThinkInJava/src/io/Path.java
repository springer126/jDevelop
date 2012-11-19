package io;



public class Path {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		System.out.println(
	            Thread.currentThread().getContextClassLoader().getResource(""));
	    System.out.println(Path.class.getClassLoader().getResource(""));
	    System.out.println(ClassLoader.getSystemResource(""));
	    System.out.println(Path.class.getResource(""));
	    System.out.println(Path.class.getResource("/"));
	    	       

	
	}

}
