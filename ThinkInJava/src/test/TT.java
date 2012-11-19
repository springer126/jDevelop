package test;


public class TT<D> {
	D b;
	int i;
	/**
	 * @param args
	 */
	
	public <D> void print(D b)
	{
		System.out.print(b.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//StringBuffer[] me = new StringBuffer[5];
		//me[0].append("1");
		
		StringBuffer buf = new StringBuffer();
		buf.append("123");
		System.out.println(buf);
		
		 TT<TT> B = new TT<TT>();
		 B.print(1);
		 
		 long f = 2;
		 long i = 1;
		 long m = 3;
		 System.out.print(""+f+m+i);
		 
		 int i1= 2;
		 int i2 = 5;
		 System.out.print(""+f+m+i);
		 
		 int x = -1;
		 System.out.print(x<<16);
		 
		 
	}
	

	public  void print(String a)
	{
		
	}

}

