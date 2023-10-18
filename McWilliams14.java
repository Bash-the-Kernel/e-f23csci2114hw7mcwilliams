//837799

public class McWilliams14 {
    public static void main(String[] args){
        System.out.println(calc());
    }

    public static long calc() {
        long max = 0;
        long maxI = 0;
        for (long i = 0; i < 1000000; i++) {
            long len = seqLen(i);
            if (len >= max) {
                max = len;
                maxI = i;
            }
        }
        return maxI;
    }

    public static long seqLen(long seed) {
        if (seed <= 0) {
            return 0;
        }
        if (seed == 1) {
            return 1;
        }
        long len = 1;
        if (seed % 2 == 0) {
            len += seqLen(seed / 2);
        } else {
            len += seqLen((3 * seed) + 1);
        }
        return len;
    }

    public void test() {
        System.out.println(seqLen(13));
        System.out.println(calc());
    }
}
