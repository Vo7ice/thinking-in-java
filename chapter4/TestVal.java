public class TestVal {

	static int[] test(int test, int testVal, int begin, int end) {
		int[] result = new int[2];
		if (testVal > test) {
			result[0] = 1;
		} else if (testVal < test) {
			result[0] = -1;
		} else {
			result[0] = 0;// match
		}
		if (testVal < begin) {
			result[1] = -1;
		} else if (testVal >= begin && testVal <= end) {
			result[1] = 0;
		} else {
			result[1] = 1;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = test(10, 2, 5, 25);
		int[] b = test(5, 15, 5, 25);
		int[] c = test(20, 25, 2, 25);
		int[] d = test(30, 45, 2, 25);
		for (int x : a) {
			System.out.println("a result"+x);
		}
		for (int x : b) {
			System.out.println("b result"+x);
		}
		for (int x : c) {
			System.out.println("c result"+x);
		}
		for (int x : d) {
			System.out.println("d result"+x);
		}

	}

}