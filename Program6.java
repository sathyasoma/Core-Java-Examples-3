import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Program6 {
	int age, id;

	LinkedList<Integer> votersList(HashMap<Integer, Integer> h) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		Set set = h.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Entry entry = (Entry) i.next();
			age = Integer.valueOf(entry.getValue().toString());
			id = Integer.valueOf(entry.getValue().toString());
			if (age >= 18)
				l.add(id);

		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program6 p = new Program6();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println("Enter id,age");
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			h.put(s.nextInt(), s.nextInt());
		}
		System.out.println(p.votersList(h));
		s.close();
	}

}
