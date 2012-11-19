package generics;

import java.util.Arrays;
import java.util.Random;

public class IceCream {

	/**
	 返回数组，从 FLAVORS中随机选择3个不相同的元素
	 */
	
	private static Random rand = new Random(47);
	static final String[] FLAVORS = {
		"chocolate","straberry","swirl",
		"praline cream","mud pie"
	};
	public static String[] flavorset(int n){
		if(n>FLAVORS.length)
			throw new IllegalArgumentException("Set too big");
		String[] results = new String[n];
		
		boolean[] picked = new boolean[FLAVORS.length];//默认为false
		for(int i=0;i<n;i++){
			int t;
			do
				t = rand.nextInt(FLAVORS.length);
			while(picked[t]);
			results[i]=FLAVORS[t];
			picked[t]=true;
			
		}
		return results;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<7;i++)
		{
			System.out.println(Arrays.toString(flavorset(3)));
			
		}
		
		boolean[] b =  new boolean[6];
		for(boolean bo:b)
		  System.out.println(bo);

	}

}
