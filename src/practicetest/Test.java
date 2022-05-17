package practicetest;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("A");
		for(String s: set) {
			System.out.println(s);
		}

	}

}
