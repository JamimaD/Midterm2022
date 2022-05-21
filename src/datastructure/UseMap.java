package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"NYC");
		map.put(2,"LA");
		map.put(3,"Chicago");
		map.put(4,"Miami");
		map.put(5,"Dallas");

		System.out.println(map);
	}

}
