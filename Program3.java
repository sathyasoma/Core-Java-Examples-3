import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {
	Map<Integer, Integer> getSquares(int a[]) {
		LinkedHashMap<Integer, Integer> l = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++)
			l.put(a[i], a[i] * a[i]);

		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 p = new Program3();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println("Enter " + n + " elements");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println(p.getSquares(a));
		s.close();
	}

}
