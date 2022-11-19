import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program7 {
	int[] getSorted(int a[]) {
		int i, j, c;
		String s1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (i = 0; i < a.length; i++) {
			s1 = Integer.toString(a[i]);
			StringBuffer sb = new StringBuffer(s1);

			al.add(Integer.parseInt(sb.reverse().toString()));
		}
		Collections.sort(al);
		int[] a1 = new int[al.size()];
		for (i = 0; i < al.size(); i++)
			a1[i] = al.get(i);
		return a1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Program7 p = new Program7();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println("Enter array elements");
		int[] a = new int[n];
		for (k = 0; k < n; k++)
			a[k] = s.nextInt();
		a = p.getSorted(a);
		for (k = 0; k < a.length; k++)
			System.out.println(a[k]);
		s.close();
	}
}
