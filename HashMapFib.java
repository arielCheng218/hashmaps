import java.util.HashMap;

public class HashMapFib {

	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	private static int fasterFib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else if (map.get(n) != null) {
			return map.get(n);
		} else {
			map.put(n - 1, fasterFib(n - 1));
			return fasterFib(n - 1) + fasterFib(n - 2);
		}
	}

	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fasterFib(45));
		System.out.println(fib(45));
	}
}

/**
 * Unoptimized:
 * private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
 */