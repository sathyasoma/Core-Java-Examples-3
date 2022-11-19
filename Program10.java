import java.util.Scanner;

public class Program10 {
	boolean validate(String s1) {
		int j = s1.length() - 4;
		if (j >= 8 && (j == s1.lastIndexOf("_job")))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program10 p = new Program10();
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println(p.validate(s1));
		s.close();
	}

}
