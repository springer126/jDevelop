package test;

public class ArgumentsTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		if(args.length==0)return;
		else{
			for(String str:args){
				System.out.println(str);
			}
			
			for(String str:args){
				try {
					    Class.forName(str);
						System.out.println("Class "+str+" is existed!");
					
				} catch (ClassNotFoundException e) {
					System.err.println("Class "+str+" is not existed!");
				}
			}
		}

	}

}

/*
abc
test.Person
jkojo
ÄãºÃ
Class test.Person is existed!
Class abc is not existed!
Class jkojo is not existed!
Class ÄãºÃ is not existed!
 */
