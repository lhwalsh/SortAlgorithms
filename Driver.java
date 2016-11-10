public class Driver {
    public static void main(String args[]) {
	long[] test = new long[1000000];
	for (long i : test) {
	    i = Math.random() * 1000000;
	}
    }
}
