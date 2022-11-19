import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Program4 {
	HashMap<Object, String> getStudents(HashMap<String, Integer> h) {
		HashMap<Object, String> h1 = new HashMap<Object, String>();
		Set set = h.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Entry entry = (Entry) i.next();
			int marks = Integer.valueOf(entry.getValue().toString());
			if (marks >= 90)
				h1.put(entry.getKey(), "Gold");
			if (marks >= 80 && marks < 90)
				h1.put(entry.getKey(), "Silver");
			if (marks >= 70 && marks < 80)
				h1.put(entry.getKey(), "Bronze");
		}
		return h1;

	}

	public static void main(String[] args) {
		Program4 p = new Program4();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		System.out.println("Enter Registrationnumber,marks");
		for (int i = 0; i < n; i++) {
			h.put(s.next(), s.nextInt());
		}
		System.out.println(p.getStudents(h));
		s.close();
	}

}
