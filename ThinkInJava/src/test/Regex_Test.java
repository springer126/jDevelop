package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test {
	public static void main(String[] args) {
//		Pattern p =Pattern.compile("a*b");
//		Matcher matcher =p.matcher("asdfasdb");
//		System.out.println(matcher.matches());
		
//		String regex="[abc]{3}";
//		String str="acb";
//		
		String regex="\\d{3}\\-\\d{2}\\-\\d{4}";
		String str="123-12-12342";
		
		
		
		boolean b=Pattern.matches(regex, str);
		System.out.println(b);
		
	}

}
