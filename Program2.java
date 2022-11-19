import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {

	Map<Character, Integer> countCharacter(char a[]) {
		int i, j, c;
		LinkedHashMap<Character, Integer> h = new LinkedHashMap<Character, Integer>();
		for (i = 0; i < a.length; i++) {
			if (a[i] == '9')
				continue;
			for (j = i + 1, c = 1; j < a.length; j++)
				if (a[i] == a[j]) {
					a[j] = '9';
					c++;
				}
			if (a[i] != '9')
				h.put(a[i], c);
		}
		return h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 p = new Program2();
		Scanner s = new Scanner(System.in);
		System.out.println("enter character array ");
		String s1 = s.next();
		char[] c = new char[s1.length()];
		for (int k = 0; k < s1.length(); k++)
			c[k] = s1.charAt(k);
		System.out.println(p.countCharacter(c));
		s.close();
	}

}
