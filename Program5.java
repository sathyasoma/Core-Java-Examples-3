import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program5 {
	int getSecondSmallest(int a[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
			al.add(a[i]);
		Collections.sort(al);
		return al.get(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 p = new Program5();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println("Enter " + n + " elements");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println(p.getSecondSmallest(a));
		s.close();
	}

}
