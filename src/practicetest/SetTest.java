package practicetest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> strset = new HashSet<>();
		strset.add("J");
		strset.add("c");
		strset.add("l");
		strset.add("s");
		Iterator iter = strset.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());

	}

}
