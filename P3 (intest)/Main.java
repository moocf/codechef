import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = 0, n = in.nextInt();
		int k = in.nextInt();
		for(int i=0; i<n; i++) {
			int t = in.nextInt();
			if(t % k == 0) c++;
		}
		System.out.println(c);
	}
}
