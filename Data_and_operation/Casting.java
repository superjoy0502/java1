
public class Casting {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		double b = (double) a;
		System.out.println(b);
		
		String c = Integer.toString(1);
		System.out.println(c);
		System.out.println(c.getClass());

	}

}
